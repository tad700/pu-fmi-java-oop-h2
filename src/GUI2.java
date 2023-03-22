import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI2 {
    private final Garage garage = new Garage();
    //TextFields
    JTextField textFieldType = new JTextField();
    JTextField textFieldLicensePlate = new JTextField();
    JTextField textFieldBrand = new JTextField();
    JTextField textFieldModel = new JTextField();
    JTextField textFieldFuelEfficiency = new JTextField();
    JTextField textFieldFuelTank = new JTextField();
    JTextField textFieldPower = new JTextField();
    JTextField textFieldYearOfMaking = new JTextField();
    JTextField textFieldDateOfRegistration = new JTextField();
    JTextField textFieldDateOfInsurance = new JTextField();
    JTextField textFieldDateOfMOT = new JTextField();
    JTextField textFieldDateTillNextTireChange = new JTextField();
    JTextField textFieldKmTillNextOilChange = new JTextField();

    //Labels
    JLabel homeMessage = new JLabel("Здравейте моля изберете опция");
    JLabel typeLabel = new JLabel("Тип");
    JLabel licensePlateLabel = new JLabel("Рег. Номер");
    JLabel brandLabel = new JLabel("Марка");
    JLabel modelLabel = new JLabel("Модел");
    JLabel fuelEfficiencyLabel = new JLabel("Разгод на гориво");
    JLabel fuelTypeLabel = new JLabel("Вид Гориво");
    JLabel fuelTankLabel = new JLabel("Размер на резервоара");
    JLabel powerLabel = new JLabel("Мощност");
    JLabel transmissionTypeLabel = new JLabel("Вид на скоросната кутия");
    JLabel yearOfMakingLabel = new JLabel("Година на създаване");
    JLabel dateOfRegLabel = new JLabel("Дата на регистрация");
    JLabel dateOfInsuranceLabel = new JLabel("Дата на застраховка");
    JLabel MotDateLabel = new JLabel("Дата на преглед");
    JLabel tireChangeLabel = new JLabel("Дата на смяна на гумите");
    JLabel oilChangeLabel = new JLabel("Км до смяна на масло");
    JFrame frame = new JFrame(garage.name);
    //Buttons
    JButton renewButton = new JButton("Поднови");
    JButton addCars = new JButton("Влизане в Гаража");
    JButton addItemToArrayList = new JButton("Add");
    JButton removeItem = new JButton("Remove");
    JButton showCars = new JButton("Покажи всички");

    //Panels
    JPanel panel1 = new JPanel();
    JPanel homePanel = new JPanel();
    JPanel wholeGarage = new JPanel();

    JPanel inputPanel = new JPanel();
    JLayeredPane layeredPane = new JLayeredPane();
    private int id = 0;

    //ComboBoxes

    String[] transmissionType = {"Ръчна", "Автоматична"};
    JComboBox transmissionTypeCombo = new JComboBox<>(transmissionType);

    String[] fuelType = {"Бензин", "Дизел", "Газ/Бензин"};
    JComboBox fuelTypeCombo = new JComboBox<>(fuelType);
    JComboBox<String> comboBoxCars = new JComboBox<String>();



    GUI2() {


        frame.setSize(700, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        homePanel.setLayout(null);
        homePanel.setBounds(0, 0, 700, 800);
        homePanel.add(homeMessage);
        homePanel.add(addCars);
        addCars.setBounds(170, 250, 300, 100);
        addCars.setFont(new Font("Arial", Font.BOLD, 20));
        addCars.setFocusable(false);
        addCars.setBackground(new Color(113, 199, 249));


        addCars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                layeredPane.setLayer(inputPanel, JLayeredPane.DRAG_LAYER);
            }
        });
        homeMessage.setFont(new Font("Arial", Font.BOLD, 24));
        homeMessage.setBounds(140, 0, 500, 30);

        //InputPanel
        inputPanel.setLayout(null);
        inputPanel.setBounds(0, 0, 700, 800);
        inputPanel.setBackground(new Color(113, 145, 249));
        textFieldType.setBounds(10, 10, 250, 30);
        inputPanel.add(textFieldType);
        textFieldLicensePlate.setBounds(10, 50, 250, 30);
        inputPanel.add(textFieldLicensePlate);
        textFieldBrand.setBounds(10, 90, 250, 30);
        inputPanel.add(textFieldBrand);
        textFieldModel.setBounds(10, 130, 250, 30);
        inputPanel.add(textFieldModel);
        textFieldFuelEfficiency.setBounds(10, 170, 250, 30);
        inputPanel.add(textFieldFuelEfficiency);
        textFieldFuelTank.setBounds(10, 210, 250, 30);
        inputPanel.add(textFieldFuelTank);
        fuelTypeCombo.setBounds(10, 250, 250, 30);
        inputPanel.add(fuelTypeCombo);
        textFieldPower.setBounds(10, 290, 250, 30);
        inputPanel.add(textFieldPower);
        inputPanel.add(transmissionTypeCombo);
        transmissionTypeCombo.setBounds(10, 330, 250, 30);
        textFieldYearOfMaking.setBounds(10, 370, 250, 30);
        inputPanel.add(textFieldYearOfMaking);
        textFieldDateOfRegistration.setBounds(10, 410, 250, 30);
        inputPanel.add(textFieldDateOfRegistration);
        textFieldDateOfInsurance.setBounds(10, 450, 250, 30);
        inputPanel.add(textFieldDateOfInsurance);
        textFieldDateOfMOT.setBounds(10, 490, 250, 30);
        inputPanel.add(textFieldDateOfMOT);
        textFieldDateTillNextTireChange.setBounds(10, 530, 250, 30);
        inputPanel.add(textFieldDateTillNextTireChange);
        textFieldKmTillNextOilChange.setBounds(10, 570, 250, 30);
        inputPanel.add(textFieldKmTillNextOilChange);
        inputPanel.add(addItemToArrayList);
        inputPanel.add(removeItem);
        inputPanel.add(typeLabel);
        inputPanel.add(comboBoxCars);
        inputPanel.add(renewButton);
        renewButton.setBounds(450, 700, 100, 30);

//Labels

        typeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        typeLabel.setForeground(Color.white);
        typeLabel.setBounds(270, 10, 100, 30);
        inputPanel.add(licensePlateLabel);
        licensePlateLabel.setFont(new Font("Arial", Font.BOLD, 16));
        licensePlateLabel.setForeground(Color.white);
        licensePlateLabel.setBounds(270, 50, 100, 30);
        inputPanel.add(brandLabel);
        brandLabel.setFont(new Font("Arial", Font.BOLD, 16));
        brandLabel.setForeground(Color.white);
        brandLabel.setBounds(270, 90, 100, 30);
        inputPanel.add(modelLabel);
        modelLabel.setFont(new Font("Arial", Font.BOLD, 16));
        modelLabel.setForeground(Color.white);
        modelLabel.setBounds(270, 130, 100, 30);
        inputPanel.add(fuelEfficiencyLabel);
        fuelEfficiencyLabel.setFont(new Font("Arial", Font.BOLD, 16));
        fuelEfficiencyLabel.setForeground(Color.white);
        fuelEfficiencyLabel.setBounds(270, 170, 200, 30);
        inputPanel.add(fuelTankLabel);
        fuelTankLabel.setFont(new Font("Arial", Font.BOLD, 16));
        fuelTankLabel.setForeground(Color.white);
        fuelTankLabel.setBounds(270, 210, 200, 30);
        inputPanel.add(fuelTypeLabel);
        fuelTypeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        fuelTypeLabel.setForeground(Color.white);
        fuelTypeLabel.setBounds(270, 250, 200, 30);
        inputPanel.add(powerLabel);
        powerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        powerLabel.setForeground(Color.white);
        powerLabel.setBounds(270, 290, 200, 30);
        inputPanel.add(transmissionTypeLabel);
        transmissionTypeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        transmissionTypeLabel.setForeground(Color.white);
        transmissionTypeLabel.setBounds(270, 330, 200, 30);
        inputPanel.add(yearOfMakingLabel);
        yearOfMakingLabel.setFont(new Font("Arial", Font.BOLD, 16));
        yearOfMakingLabel.setForeground(Color.white);
        yearOfMakingLabel.setBounds(270, 370, 200, 30);
        inputPanel.add(dateOfRegLabel);
        dateOfRegLabel.setFont(new Font("Arial", Font.BOLD, 16));
        dateOfRegLabel.setForeground(Color.white);
        dateOfRegLabel.setBounds(270, 410, 200, 30);
        inputPanel.add(dateOfInsuranceLabel);
        dateOfInsuranceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        dateOfInsuranceLabel.setForeground(Color.white);
        dateOfInsuranceLabel.setBounds(270, 450, 200, 30);
        inputPanel.add(MotDateLabel);
        MotDateLabel.setFont(new Font("Arial", Font.BOLD, 16));
        MotDateLabel.setForeground(Color.white);
        MotDateLabel.setBounds(270, 490, 200, 30);
        inputPanel.add(tireChangeLabel);
        tireChangeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        tireChangeLabel.setForeground(Color.white);
        tireChangeLabel.setBounds(270, 530, 200, 30);
        inputPanel.add(oilChangeLabel);
        oilChangeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        oilChangeLabel.setForeground(Color.white);
        oilChangeLabel.setBounds(270, 570, 200, 30);



        showCars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layeredPane.setLayer(inputPanel, JLayeredPane.POPUP_LAYER);
                layeredPane.setLayer(wholeGarage, JLayeredPane.DRAG_LAYER);
            }
        });



        addItemToArrayList.setBounds(200, 700, 100, 30);
        removeItem.setBounds(100, 700, 100, 30);
        garage.fillCarsCombo(comboBoxCars);


        addItemToArrayList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = textFieldType.getText();
                String brand = textFieldBrand.getText();
                String model = textFieldModel.getText();
                String licensePlate = textFieldLicensePlate.getText();
                int fuelEfficiency = Integer.parseInt(textFieldFuelEfficiency.getText());
                int fuelTankCapacity = Integer.parseInt(textFieldFuelTank.getText());
                String fuelType = String.valueOf(fuelTypeCombo);
                int power = Integer.parseInt(textFieldPower.getText());
                String transmissionType = String.valueOf(transmissionTypeCombo);
                int yearOfMaking = Integer.parseInt(textFieldYearOfMaking.getText());
                String dateOfRegistration = textFieldDateOfRegistration.getText();
                String dateOfInsurance = textFieldDateOfInsurance.getText();
                String dateOfMOT = textFieldDateOfMOT.getText();
                String dateTillNextTireChange = String.valueOf(textFieldDateTillNextTireChange.getText());
                int kmTillNextOilChange = Integer.parseInt(textFieldKmTillNextOilChange.getText());

                Car car = new Car(type, brand, model, licensePlate, id, fuelEfficiency, fuelTankCapacity, fuelType, power, transmissionType, yearOfMaking, dateOfRegistration, dateOfInsurance, dateOfMOT, dateTillNextTireChange, kmTillNextOilChange);
                car.setType(type);
                car.setBrand(brand);
                car.setModel(model);
                car.setLicensePlate(licensePlate);
                System.out.println(id);
                car.setId(id);
                id++;
                garage.addCar(car);
                garage.fillCarsCombo(comboBoxCars);
                System.out.println(garage.cars);

                comboBoxCars.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
            if(car.getId()==comboBoxCars.getSelectedIndex()){
                displayAttributes(car);
                }

                    }
                });
            }


        });


        class RemoveAction implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String selection = (String) comboBoxCars.getSelectedItem();
                int id = Integer.parseInt(selection.split(", ")[0]);
                garage.deleteAnimal(id);
                garage.fillCarsCombo(comboBoxCars);

                removeText();
            }


        }
        removeItem.addActionListener(new RemoveAction());
comboBoxCars.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {


    }
});
              renewButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for(Car car : garage.cars){
                            if(car.getId()==comboBoxCars.getSelectedIndex()){
                                car.setType(textFieldType.getText());
                                car.setLicensePlate(textFieldLicensePlate.getText());
                                car.setBrand(textFieldBrand.getText());
                                car.setModel(textFieldModel.getText());
                                car.setFuelEfficiency(Integer.parseInt(textFieldFuelEfficiency.getText()));
                                car.setFuelTankCapacity(Integer.parseInt(textFieldFuelTank.getText()));
                                car.setFuelType((String) fuelTypeCombo.getSelectedItem());
                                car.setPower(Integer.parseInt(textFieldPower.getText()));
                                car.setTransmissionType((String) transmissionTypeCombo.getSelectedItem());
                                car.setYearOfMaking(Integer.parseInt(textFieldYearOfMaking.getText()));
                                car.setDateOfRegistration(textFieldDateOfRegistration.getText());
                                car.setDateOfInsurance(textFieldDateOfInsurance.getText());
                                car.setDateOfMOT(textFieldDateOfMOT.getText());
                                car.setDateOfNextTiresChange(textFieldDateTillNextTireChange.getText());
                                car.setKmTillNextOilChange(Integer.parseInt(textFieldKmTillNextOilChange.getText()));
                                garage.fillCarsCombo(comboBoxCars);
                                System.out.println(garage.cars);
                            }
                        }
                    }
                });



        panel1.setBounds(0, 0, 200, 800);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);

        comboBoxCars.setBounds(333, 0, 350, 20);

        layeredPane.setLayout(null);
        layeredPane.setBounds(0, 0, 700, 800);
        layeredPane.add(panel1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(inputPanel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(homePanel, JLayeredPane.POPUP_LAYER);
        layeredPane.add(wholeGarage,JLayeredPane.MODAL_LAYER);
        frame.add(layeredPane);

        frame.setVisible(true);


    }

    public void displayAttributes(Car car){


    textFieldType.setText(car.getType());
    textFieldLicensePlate.setText(car.licensePlate);
    textFieldBrand.setText(car.getBrand());
    textFieldModel.setText(car.getModel());
    textFieldFuelEfficiency.setText(String.valueOf(car.getFuelEfficiency()));
    fuelTypeCombo.setSelectedItem(car.getFuelType());
    textFieldPower.setText(String.valueOf(car.getPower()));
    transmissionTypeCombo.setSelectedItem(car.getTransmissionType());
    textFieldYearOfMaking.setText(String.valueOf(car.getYearOfMaking()));
    textFieldDateOfRegistration.setText(car.getDateOfRegistration());
    textFieldDateOfInsurance.setText(car.getDateOfInsurance());
    textFieldDateOfMOT.setText(car.getDateOfMOT());
    textFieldDateTillNextTireChange.setText(car.getDateOfNextTiresChange());
    textFieldKmTillNextOilChange.setText(String.valueOf(car.getKmTillNextOilChange()));


    }
    public void removeText(){
        textFieldType.setText("");
        textFieldLicensePlate.setText("");
        textFieldBrand.setText("");
        textFieldModel.setText("");
        textFieldFuelEfficiency.setText("");
        textFieldPower.setText("");
        textFieldFuelTank.setText("");
        textFieldYearOfMaking.setText("");
        textFieldDateOfRegistration.setText("");
        textFieldDateOfInsurance.setText("");
        textFieldDateOfMOT.setText("");
        textFieldDateTillNextTireChange.setText("");
        textFieldKmTillNextOilChange.setText("");
    }


    public void setCarAttributes(Car car){

        car.setType(textFieldType.getText());

        car.setLicensePlate(textFieldLicensePlate.getText());

        car.setBrand(textFieldBrand.getText());
        car.setModel(textFieldModel.getText());
        car.setFuelEfficiency(Integer.parseInt(textFieldFuelEfficiency.getText()));
        car.setFuelTankCapacity(Integer.parseInt(textFieldFuelTank.getText()));
        car.setFuelType((String) fuelTypeCombo.getSelectedItem());
        car.setPower(Integer.parseInt(textFieldPower.getText()));
        car.setTransmissionType((String) transmissionTypeCombo.getSelectedItem());
        car.setYearOfMaking(Integer.parseInt(textFieldYearOfMaking.getText()));
        car.setDateOfRegistration(textFieldDateOfRegistration.getText());
        car.setDateOfInsurance(textFieldDateOfInsurance.getText());
        car.setDateOfMOT(textFieldDateOfMOT.getText());
        car.setDateOfNextTiresChange(textFieldDateTillNextTireChange.getText());
        car.setKmTillNextOilChange(Integer.parseInt(textFieldKmTillNextOilChange.getText()));


        if(car.getType().length()>100){
            JOptionPane.showMessageDialog(null,"Вида трябва да е по малко от 100 символа");
        } else if(car.getLicensePlate().length()>10){
            JOptionPane.showMessageDialog(null,"Рег.Номер трянва да е по малко от 10 символа");
        }else if(car.getBrand().length()>20){
            JOptionPane.showMessageDialog(null,"Марката трябва да е по малко от 20 символа");
        }else if(car.getModel().length()>20){
            JOptionPane.showMessageDialog(null,"Модела трябва да е по малко от 20 символа");
        }else if(car.getFuelEfficiency()<0){
            JOptionPane.showMessageDialog(null,"Разхода трябва да е по голям от 0");
        }else if(car.getFuelTankCapacity()<0){
            JOptionPane.showMessageDialog(null,"Обема на резервоара трябва да е по голямо от 0");
        }else if(car.getPower()<0){
            JOptionPane.showMessageDialog(null,"Мощността не трябва да е отрицателно число");
        }else if(car.getYearOfMaking()>2022 && car.getYearOfMaking()<0){
            JOptionPane.showMessageDialog(null,"Годиината на създаване не трябва да е в бъдещето");
        }
        else if(car.getKmTillNextOilChange()<0){
            JOptionPane.showMessageDialog(null,"Километрите не могат да бъдат отрицателно число");
        }else{  garage.addCar(car);
            comboBoxCars.addItem(car.getLicensePlate()+" "+car.getBrand()+" "+car.getModel());
            JOptionPane.showMessageDialog(null,"Колата "+car.getBrand() + " е добавена успешно");
        }
    }
}

