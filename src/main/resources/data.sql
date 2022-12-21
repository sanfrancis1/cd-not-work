CREATE TABLE users (  
	Id INT AUTO_INCREMENT  PRIMARY KEY,
	Name VARCHAR(55) NOT NULL,
	Email VARCHAR(50) NOT NULL,
	Mobile_Number VARCHAR(20) NOT NULL,
	Address VARCHAR(255) NOT NULL,
	Country VARCHAR(50) NOT NULL,
	Created_date DATETIME  NOT NULL,
	Lastupdated_date DATETIME  NULL,
	Active BOOLEAN  NOT NULL
	);  
	
	
CREATE TABLE roles (  
	Id INT AUTO_INCREMENT  PRIMARY KEY,
	Role VARCHAR(55) NOT NULL,
	Active BOOLEAN  NOT NULL
	);  
	
	
CREATE TABLE user_roles (  
	Id INT AUTO_INCREMENT  PRIMARY KEY,
	Userid INT NOT NULL ,
	Roleid INT  NOT NULL,
	Active BOOLEAN  NOT NULL,
	FOREIGN KEY (Userid) REFERENCES users(Id),
	FOREIGN KEY (Roleid) REFERENCES roles(Id)
	
	);  	
	
	
 
	
		
insert into users( Name, email, Mobile_Number, Address, Country, Created_date, Lastupdated_date, Active) 
values( 'admin', 'admin@gmail.com', '8870660284',  'Test', 'India', CURRENT_TIMESTAMP(), null, 1);