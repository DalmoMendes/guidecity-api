CREATE TABLE PERSON (
  ID INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  PERSON_FIRST_NAME VARCHAR(100)  NULL  ,
  PERSON_LAST_NAME VARCHAR(100)  NULL  ,
  PERSON_EMAIL VARCHAR(255)  NULL  ,
  PERSON_CPF VARCHAR(14)  NULL  ,
  PERSON_BIRTH_DATE DATE  NULL  ,
  PERSON_STATUS INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(ID));


CREATE TABLE PHONE (
  ID INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  PERSON_ID INTEGER UNSIGNED  NOT NULL  ,
  PHONE_TYPE VARCHAR(20)  NULL  ,
  PHONE_NUMBER VARCHAR(14)  NULL  ,
  PHONE_STATUS INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(ID)  ,
INDEX PHONE_FKIndex1(PERSON_ID),
  FOREIGN KEY(PERSON_ID)
    REFERENCES PERSON(ID)
      ON DELETE CASCADE
      ON UPDATE NO ACTION);


CREATE TABLE ADRESS (
  ID INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  PERSON_ID INTEGER UNSIGNED  NOT NULL  ,
  ADRESS_ZIPCODE VARCHAR(10)  NULL  ,
  ADRESS_STREET VARCHAR(255)  NULL  ,
  ADRESS_DISTRICT VARCHAR(100)  NULL  ,
  ADRESS_STATE VARCHAR(50)  NULL  ,
  ADRESS_COUTRY VARCHAR(50)  NULL  ,
  ADRESS_STATUS INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(ID)  ,
INDEX ADRESS_FKIndex1(PERSON_ID),
  FOREIGN KEY(PERSON_ID)
    REFERENCES PERSON(ID)
      ON DELETE CASCADE
      ON UPDATE NO ACTION);


CREATE TABLE NETWORK (
  ID INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  PERSON_ID INTEGER UNSIGNED  NOT NULL  ,
  NETWORK_NAME VARCHAR(50)  NULL  ,
  NETWORK_LINK VARCHAR(255)  NULL  ,
  NETWORK_STATUS INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(ID)  ,
INDEX NETWORK_FKIndex1(PERSON_ID),
  FOREIGN KEY(PERSON_ID)
    REFERENCES PERSON(ID)
      ON DELETE CASCADE
      ON UPDATE NO ACTION);



