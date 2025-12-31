package Dsa_Practice.Others;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class SortingVisualizer extends JFrame {
    private ArrayList<Integer> array;
    private SortingPanel sortingPanel;
    private JComboBox<String> algorithmSelector;
    private JSlider speedSlider;
    private JSlider sizeSlider;
    private JButton startButton, resetButton, customInputButton;
    private JTextField customInputField;
    private boolean sorting = false;
    private int speed = 50;

    public SortingVisualizer() {
        setTitle("Sorting Algorithm Visualizer");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(30, 30, 40));

        array = new ArrayList<>();
        generateRandomArray(50);

        sortingPanel = new SortingPanel();
        add(sortingPanel, BorderLayout.CENTER);

        add(createControlPanel(), BorderLayout.SOUTH);
        add(createTopPanel(), BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        panel.setBackground(new Color(40, 40, 50));

        JLabel titleLabel = new JLabel("Sorting Algorithm Visualizer");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        panel.add(titleLabel);

        return panel;
    }

    private JPanel createControlPanel() {
        JPanel mainPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        mainPanel.setBackground(new Color(40, 40, 50));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // First row - Algorithm and buttons
        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        row1.setBackground(new Color(40, 40, 50));

        JLabel algoLabel = new JLabel("Algorithm:");
        algoLabel.setForeground(Color.WHITE);
        algoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        row1.add(algoLabel);

        String[] algorithms = {"Bubble Sort", "Quick Sort", "Merge Sort"};
        algorithmSelector = new JComboBox<>(algorithms);
        algorithmSelector.setPreferredSize(new Dimension(150, 30));
        algorithmSelector.setFont(new Font("Arial", Font.PLAIN, 14));
        row1.add(algorithmSelector);

        startButton = new JButton("Start Sorting");
        startButton.setPreferredSize(new Dimension(130, 35));
        startButton.setFont(new Font("Arial", Font.BOLD, 13));
        startButton.setBackground(new Color(76, 175, 80));
        startButton.setForeground(Color.WHITE);
        startButton.setFocusPainted(false);
        startButton.addActionListener(e -> startSorting());
        row1.add(startButton);

        resetButton = new JButton("Generate New");
        resetButton.setPreferredSize(new Dimension(130, 35));
        resetButton.setFont(new Font("Arial", Font.BOLD, 13));
        resetButton.setBackground(new Color(33, 150, 243));
        resetButton.setForeground(Color.WHITE);
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(e -> {
            generateRandomArray((int) array.size());
            sortingPanel.repaint();
        });
        row1.add(resetButton);

        // Second row - Speed control
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
        row2.setBackground(new Color(40, 40, 50));

        JLabel speedLabel = new JLabel("Speed:");
        speedLabel.setForeground(Color.WHITE);
        speedLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        row2.add(speedLabel);

        speedSlider = new JSlider(1, 100, 50);
        speedSlider.setPreferredSize(new Dimension(300, 40));
        speedSlider.setMajorTickSpacing(25);
        speedSlider.setPaintTicks(true);
        speedSlider.setBackground(new Color(40, 40, 50));
        speedSlider.setForeground(Color.WHITE);
        speedSlider.addChangeListener(e -> speed = speedSlider.getValue());
        row2.add(speedSlider);

        JLabel sizeLabel = new JLabel("Array Size:");
        sizeLabel.setForeground(Color.WHITE);
        sizeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        row2.add(sizeLabel);

        sizeSlider = new JSlider(10, 100, 50);
        sizeSlider.setPreferredSize(new Dimension(300, 40));
        sizeSlider.setMajorTickSpacing(30);
        sizeSlider.setPaintTicks(true);
        sizeSlider.setBackground(new Color(40, 40, 50));
        sizeSlider.setForeground(Color.WHITE);
        sizeSlider.addChangeListener(e -> {
            if (!sorting) {
                generateRandomArray(sizeSlider.getValue());
                sortingPanel.repaint();
            }
        });
        row2.add(sizeSlider);

        // Third row - Custom input
        JPanel row3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        row3.setBackground(new Color(40, 40, 50));

        JLabel customLabel = new JLabel("Custom Input (comma-separated):");
        customLabel.setForeground(Color.WHITE);
        customLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        row3.add(customLabel);

        customInputField = new JTextField(30);
        customInputField.setFont(new Font("Arial", Font.PLAIN, 14));
        customInputField.setToolTipText("Enter numbers separated by commas (e.g., 50,20,80,10,60)");
        row3.add(customInputField);

        customInputButton = new JButton("Load Array");
        customInputButton.setPreferredSize(new Dimension(120, 30));
        customInputButton.setFont(new Font("Arial", Font.BOLD, 12));
        customInputButton.setBackground(new Color(156, 39, 176));
        customInputButton.setForeground(Color.WHITE);
        customInputButton.setFocusPainted(false);
        customInputButton.addActionListener(e -> loadCustomArray());
        row3.add(customInputButton);

        mainPanel.add(row1);
        mainPanel.add(row2);
        mainPanel.add(row3);

        return mainPanel;
    }

    private void generateRandomArray(int size) {
        array.clear();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array.add(rand.nextInt(400) + 10);
        }
    }

    private void loadCustomArray() {
        String input = customInputField.getText().trim();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter comma-separated numbers!");
            return;
        }

        try {
            String[] numbers = input.split(",");
            ArrayList<Integer> newArray = new ArrayList<>();

            for (String num : numbers) {
                int value = Integer.parseInt(num.trim());
                if (value > 0) {
                    newArray.add(value);
                }
            }

            if (newArray.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No valid numbers entered!");
                return;
            }

            array = newArray;
            sizeSlider.setValue(array.size());
            sortingPanel.repaint();
            customInputField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid numbers.");
        }
    }

    private void startSorting() {
        if (sorting) return;

        sorting = true;
        startButton.setEnabled(false);
        resetButton.setEnabled(false);
        customInputButton.setEnabled(false);
        algorithmSelector.setEnabled(false);
        sizeSlider.setEnabled(false);

        String selectedAlgorithm = (String) algorithmSelector.getSelectedItem();

        Thread sortThread = new Thread(() -> {
            try {
                switch (selectedAlgorithm) {
                    case "Bubble Sort":
                        bubbleSort();
                        break;
                    case "Quick Sort":
                        quickSort(0, array.size() - 1);
                        break;
                    case "Merge Sort":
                        mergeSort(0, array.size() - 1);
                        break;
                }

                sortingPanel.setCompleted(true);
                sortingPanel.repaint();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                sorting = false;
                startButton.setEnabled(true);
                resetButton.setEnabled(true);
                customInputButton.setEnabled(true);
                algorithmSelector.setEnabled(true);
                sizeSlider.setEnabled(true);
            }
        });

        sortThread.start();
    }

    private void bubbleSort() throws InterruptedException {
        int n = array.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                sortingPanel.setComparing(j, j + 1);
                sortingPanel.repaint();
                Thread.sleep(101 - speed);

                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                    sortingPanel.repaint();
                }
            }
        }
        sortingPanel.clearComparing();
    }

    private void quickSort(int low, int high) throws InterruptedException {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) throws InterruptedException {
        int pivot = array.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            sortingPanel.setComparing(j, high);
            sortingPanel.repaint();
            Thread.sleep(101 - speed);

            if (array.get(j) < pivot) {
                i++;
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                sortingPanel.repaint();
            }
        }

        int temp = array.get(i + 1);
        array.set(i + 1, array.get(high));
        array.set(high, temp);
        sortingPanel.repaint();

        return i + 1;
    }

    private void mergeSort(int left, int right) throws InterruptedException {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) throws InterruptedException {
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for (int i = left; i <= mid; i++) leftArr.add(array.get(i));
        for (int i = mid + 1; i <= right; i++) rightArr.add(array.get(i));

        int i = 0, j = 0, k = left;

        while (i < leftArr.size() && j < rightArr.size()) {
            sortingPanel.setComparing(k, k);
            sortingPanel.repaint();
            Thread.sleep(101 - speed);

            if (leftArr.get(i) <= rightArr.get(j)) {
                array.set(k++, leftArr.get(i++));
            } else {
                array.set(k++, rightArr.get(j++));
            }
            sortingPanel.repaint();
        }

        while (i < leftArr.size()) {
            array.set(k++, leftArr.get(i++));
            sortingPanel.repaint();
            Thread.sleep(101 - speed);
        }

        while (j < rightArr.size()) {
            array.set(k++, rightArr.get(j++));
            sortingPanel.repaint();
            Thread.sleep(101 - speed);
        }

        sortingPanel.clearComparing();
    }

    class SortingPanel extends JPanel {
        private int comparing1 = -1;
        private int comparing2 = -1;
        private boolean completed = false;

        public void setComparing(int i, int j) {
            comparing1 = i;
            comparing2 = j;
            completed = false;
        }

        public void clearComparing() {
            comparing1 = -1;
            comparing2 = -1;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
            clearComparing();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            setBackground(new Color(30, 30, 40));

            if (array.isEmpty()) return;

            int width = getWidth();
            int height = getHeight();
            int barWidth = width / array.size();
            int maxValue = array.stream().max(Integer::compareTo).orElse(1);

            for (int i = 0; i < array.size(); i++) {
                int barHeight = (int) ((double) array.get(i) / maxValue * (height - 40));
                int x = i * barWidth;
                int y = height - barHeight - 10;

                Color barColor;
                if (completed) {
                    barColor = new Color(76, 175, 80); // Green when sorted
                } else if (i == comparing1 || i == comparing2) {
                    barColor = new Color(244, 67, 54); // Red for comparing
                } else {
                    barColor = new Color(100, 150, 255); // Blue default
                }

                g2d.setColor(barColor);
                g2d.fillRect(x + 2, y, barWidth - 4, barHeight);

                g2d.setColor(barColor.darker());
                g2d.drawRect(x + 2, y, barWidth - 4, barHeight);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SortingVisualizer());
    }
}
