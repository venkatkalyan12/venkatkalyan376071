show databases;

CREATE TABLE User_Details (
  User_id int NOT NULL,
  Firstt_Name varchar(45) NOT NULL,
  Last_Name varchar(45) NOT NULL,
  Date_Of_Birth date NOT NULL,
  Phone_Number varchar(15) NOT NULL,
  Address varchar(80) NOT NULL,
  PassWord int(12)  NOT NULL,
  PRIMARY KEY (User_id)
);
describe User_Details;

CREATE TABLE BankAccount_Details (
  User_id int NOT NULL,
  Bank_Acc_Num varchar(25),
  Bank_Name varchar(50),
  IFSC_Code varchar(12) NOT NULL,
  Acc_Type enum("CURRENT","SAVINGS","SALARY","LOAN"),
  Acc_Balance double,
  BankAccount_pin int NOT NULL,
	FOREIGN KEY (User_id) REFERENCES User_Details (User_id),
    PRIMARY KEY (Bank_Acc_Num)
    );
    
    describe BankAccount_Details;
    
    CREATE TABLE Wallet_Details (
    User_id int,
    Wallet_id int,
   Current_Bal double,
  FOREIGN KEY (User_id) REFERENCES User_Details (User_id),
  primary key (Wallet_id)
);
    
    CREATE TABLE Transaction_Details (
     Txn_Id int NOT NULL,
     Txn_Date_Time datetime NOT NULL,
     Txn_Amount double,
     Txn_Type enum("CREDIT","DEBIT"),
     Txn_Acc_Type enum("BANK_ACCOUNT","WALLET","CASH"),
     User_Id int,
    FOREIGN KEY (User_Id) REFERENCES User_Details (User_Id),
    PRIMARY KEY (Txn_Id)
);
--  drop table Transaction_Details;
describe Transaction_Details;
 
