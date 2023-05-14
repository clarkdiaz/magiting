package com.mycompany.main;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap to store employee information
    HashMap<Integer, Employee> employeeMap = new HashMap<>();
    employeeMap.put(10001, new Employee("Crisostomo, Jose", "02/014/1988", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ", "918-621-603", "49-1632020-8", "382189453145", "317-674-022-000", "441093369646", "Regular", "Hr Manager", "N/A", "62,670"));
    employeeMap.put(10002, new Employee("Mata, Christian" ,	"10/21/1987",	"90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu", "783-776-744", "49-2959312-6",	"824187961962",	"103-100-522-000",	"631052853464", "Regular",	"Account Team Leader",	"Romualdez, Fredrick",	"42,975"));
    employeeMap.put(10003, new Employee("San Jose, Brad", 	"03/15/1996",	"99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi",	"797-009-261",	"40-2400714-1",	"239192926939", "672-474-690-000",	"210850209964", 	"Regular",	"HR Team Leader",	"Crisostomo, Jose",	"42,975"));
    employeeMap.put(10004, new Employee("Salcedo, Anthony",	"09/14/1993",	"93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate",	"070-766-300",	"26-9647608-3",	"126445315651",	"210-805-911-000",	"218002473454", 	"Regular",	"Payroll Manager",	"Crisostomo, Jose",	"60,825"));
    employeeMap.put(10005, new Employee("Romualdez	Alice"	,"05/14/1992",	"12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte", 	"983-606-799",	" 55-4476527-2",	"545652640232",	"888-572-294-000",	"211385556888",	"Regular",	"HR Rank and File",	"San Jose, Brad",	"22,500"));
    employeeMap.put(10006, new Employee("Atienza, Rosie", "09/024/1948", "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte ", "266-036-427", "41-0644692-3", "708988234853", "604-997-793-000", "260107732354", "Regular", "HR Rank and File", "San Jose, Brad", "22,500"));
    employeeMap.put(10007, new Employee("Farala, Martha", "01/011/1942", "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte ", "329-034-366", "45-5656375-0", "233693897247", "210-835-851-000", "631130283546", "Regular", "Payroll Rank and File", "Farala, Martha", "24,000"));
    employeeMap.put(10008, new Employee("Martinez, Leila", "07/011/1970", "37/46 Kulas Roads, Maragondon 0962 Quirino ", "877-110-749", "27-2090996-4", "515741057496", "275-792-513-000", "101205445886", "Regular", "Payroll Rank and File", "Farala, Martha", "24,000"));
    employeeMap.put(10009, new Employee("San Jose, Allison", "06/024/1986", "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union ", "179-075-129", "45-3251383-0", "745148459521", "121-203-336-000", "114901859343", "Regular", "Account Rank and File", "Mata, Christian", "22,500"));
    employeeMap.put(10010, new Employee("Rosario, Cydney", "10/006/1996", "93A/21 Berge Points, Tapaz 2180 Quezon ", "868-819-912", "49-1629900-2", "579253435499", "122-244-511-000", "265104358643", "Regular", "Account Rank and File", "Mata, Christian", "22,500"));
    employeeMap.put(10011, new Employee("Lopez, Josie", "01/014/1937", "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro ", "478-355-427", "44-8563448-3", "431709011012", "218-489-737-000", "113071293354", "Regular", "Payroll Team Leader", "Salcedo, Anthony", "38,475"));
    employeeMap.put(10012, new Employee("De Leon, Selena", "02/020/1945", "89A Armstrong Trace, Compostela 7874 Maguindanao ", "975-432-139", "27-2090208-8", "587272469938", "482-259-498-000", "719007608464", "Regular", "Account Team Leader", "Romualdez, Fredrick", "41,850"));
    employeeMap.put(10013, new Employee("Romualdez, Fredrick", "03/010/1985", "22A/52 Lubowitz Meadows, Pililla 4895 Zambales ", "023-079-009", "26-8768374-1", "308366860059", "598-065-761-000", "223057707853", "Regular", "Account Manager", "Crisostomo, Jose", "63,500"));
    employeeMap.put(10014, new Employee("Bautista, Mark", "02/012/1961", "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino ", "683-725-348", "49-1647342-5", "399665157135", "273-970-941-000", "260054585575", "Regular", "Account Rank and File", "Mata, Christian", "23,250"));
    employeeMap.put(10015, new Employee("Lazaro, Darlene", "11/025/1985", "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino ", "740-721-558", "45-5617168-2", "606386917510", "354-650-951-000", "104907708845", "Probationary", "Account Rank and File", "Mata, Christian", "23,250"));
    employeeMap.put(10016, new Employee("Delos Santos, Kolby", "02/026/1980", "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur ", "739-443-033", "52-0109570-6", "357451271274", "187-500-345-000", "113017988667", "Probationary", "Account Rank and File", "Mata, Christian", "24,000"));
    employeeMap.put(10017, new Employee("Santos, Vella", "12/031/1983", "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur ", "955-879-269", "52-9883524-3", "548670482885", "101-558-994-000", "360028104576", "Probationary", "Account Rank and File", "Mata, Christian", "22,500"));
    employeeMap.put(10018, new Employee("Del Rosario, Tomas", "12/018/1978", "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque ", "882-550-989", "45-5866331-6", "953901539995", "560-735-732-000", "913108649964", "Probationary", "Account Rank and File", "Mata, Christian", "22,500"));
    employeeMap.put(10019, new Employee("Tolentino, Jacklyn", "05/019/1944", "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao ", "675-757-366", "47-1692793-0", "753800654114", "841-177-857-000", "210546661243", "Probationary", "Account Rank and File", "De Leon, Selena", "24,000"));
    employeeMap.put(10020, new Employee("Gutierrez, Percival", "12/018/1970", "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur ", "512-899-876", "40-9504657-8", "797639382265", "502-995-671-000", "210897095686", "Probationary", "Account Rank and File", "De Leon, Selena", "24,750"));
    employeeMap.put(10021, new Employee("Manalaysay, Garfield", "08/028/1966", "560 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur ", "948-628-136", "45-3298166-4", "810909286264", "336-676-445-000", "211274476563", "Probationary", "Account Rank and File", "De Leon, Selena", "24,750"));
    employeeMap.put(10022, new Employee("Villegas, Lizeth", "12/012/1981", "66/77 Mann Views, Luisiana 1263 Dinagat Islands ", "332-372-215", "40-2400719-4", "934389652994", "210-395-397-000", "122238077997", "Probationary", "Account Rank and File", "De Leon, Selena", "24,000"));
    employeeMap.put(10023, new Employee("Ramos, Carol", "08/020/1978", "72/70 Stamm Spurs, Bustos 4550 Iloilo ", "250-700-389", "60-1152206-4", "351830469744", "395-032-717-000", "212141893454", "Probationary", "Account Rank and File", "De Leon, Selena", "22,500"));
    employeeMap.put(10024, new Employee("Maceda, Emelia", "04/014/1963", "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija ", "973-358-041", "54-1331005-0", "465087894112", "215-973-013-000", "515012579765", "Probationary", "Account Rank and File", "De Leon, Selena", "22,500"));
    employeeMap.put(10025, new Employee("Aguilar, Delia", "01/027/1939", "95 Cremin Junction, Surallah 2809 Cotabato ", "529-705-439", "52-1859253-1", "136451303068", "599-312-588-000", "110018813465", "Probationary", "Account Rank and File", "De Leon, Selena", "22,500"));

        
      

    // Prompt user to input employee number
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your employee number: ");
    int employeeNumber = scanner.nextInt();

    // Look up employee information in HashMap and print it out
    Employee employee = employeeMap.get(employeeNumber);
    if (employee != null) {
      System.out.println("Employee name: " + employee.getName());
      System.out.println("Birthdate: " + employee.getBirthdate());
      System.out.println("Address: " + employee.getAddress());
      System.out.println("Phone number: " + employee.getPhoneNumber());
      System.out.println("SSS#:" + employee.getSSS());
      System.out.println("Philhealth#:" + employee.getPhilhealth() );
      System.out.println("TIN#:" + employee.getTIN()) ;
      System.out.println("Pag-Ibig#:"  +employee.getPagIbig());
      System.out.println("Status:" + employee.getStatus());
      System.out.println("Position:"  + employee.getPosition());
      System.out.println("Immediate Supervisor:" +employee.getImmediateSupervisor());
      System.out.println("Basic Salary:" + employee.getBasicSalary());
      System.out.println(); 
  Pay.computeSalary()    ;
      //Pay Salary = new Pay ();
      //Salary.computeSalary();
    } else {
      System.out.println("Invalid employee number.");
        
         
      
      
    }
  }
}

class Employee {
  private final String name;
  private final String birthdate;
  private final String address;
  private final String phoneNumber;
  private final String SSS;
  private final String Philhealth;
  private final String TIN;
  private final String PagIbig;
  private final String Status;
  private final String Position;
  private final String ImmediateSupervisor;
  private final String BasicSalary;
   
  
  

  public Employee(String name, String birthdate, String address, String phoneNumber, String SSS, String Philhealth, String TIN, String PagIbig, String Status, String Position, String ImmediateSupervisor, String BasicSalary ) {
    this.name = name;
    this.birthdate = birthdate;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.SSS = SSS;
    this.Philhealth = Philhealth;
    this.TIN = TIN;
    this.PagIbig = PagIbig;
    this.Status = Status;
    this.Position = Position;
    this.ImmediateSupervisor = ImmediateSupervisor;
    this.BasicSalary = BasicSalary;
  }

  public String getName() {
    return name;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
    
 public String getSSS() {
        return SSS;
    }
 public String getPhilhealth() {
        return Philhealth;
    }
 public String getTIN() {
	    return TIN;   
 }
 public String getPagIbig() {
	    return PagIbig;  
 }
 public String getStatus() {
	    return Status;
 }
 public String getPosition() {
	    return Position;
 }
 public String getImmediateSupervisor() {
	    return ImmediateSupervisor;
}
 public String getBasicSalary() {
	    return BasicSalary;
 }
}




