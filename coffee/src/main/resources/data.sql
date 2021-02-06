INSERT INTO COURIER (COURIERCOMP_ID,COMP_ADDRESS,COMP_NAME,COMPTEL_NO) VALUES (1,'NEGOMBO','JAPAN TECH','0112457963');
INSERT INTO COURIER (COURIERCOMP_ID,COMP_ADDRESS,COMP_NAME,COMPTEL_NO) VALUES (2,'COLOMBO','COLOMBO DELIVERY','0112457963');
INSERT INTO COURIER (COURIERCOMP_ID,COMP_ADDRESS,COMP_NAME,COMPTEL_NO) VALUES (3,'KALUTARA','KALUTARA DELIVERY','0112457963');
INSERT INTO COURIER (COURIERCOMP_ID,COMP_ADDRESS,COMP_NAME,COMPTEL_NO) VALUES (4,'JAFFNA','JAFFNA DELIVERY','0112457963');
INSERT INTO COURIER (COURIERCOMP_ID,COMP_ADDRESS,COMP_NAME,COMPTEL_NO) VALUES (5,'NEGOMBO','NEGOMBO DELIVERY','0112457963');


INSERT INTO CUSTOMER(CUS_ID,CUS_CITY, CUSFNAME,CUSLNAME,CUS_ADDRESS,CUS_POSTAL_CODE,CUS_STATE,CUS_TEL) VALUES (1,'KALUTARA','CHAMOD','PERERA','10/2, Kalutara South Sri Lanka',12000,'WESTERN','0342228739');
INSERT INTO CUSTOMER(CUS_ID,CUS_CITY, CUSFNAME,CUSLNAME,CUS_ADDRESS,CUS_POSTAL_CODE,CUS_STATE,CUS_TEL) VALUES (2,'KALUTARA','SAMANTHA','PERERA','11/2, Bambalapitiya Sri Lanka',13000,'WESTERN','+94-11-2324626');
INSERT INTO CUSTOMER(CUS_ID,CUS_CITY, CUSFNAME,CUSLNAME,CUS_ADDRESS,CUS_POSTAL_CODE,CUS_STATE,CUS_TEL) VALUES (3,'KALUTARA','GAYAN','PERERA','12/2, Kollupitiya Sri Lanka',14000,'WESTERN','+94-11- 2343333');
INSERT INTO CUSTOMER(CUS_ID,CUS_CITY, CUSFNAME,CUSLNAME,CUS_ADDRESS,CUS_POSTAL_CODE,CUS_STATE,CUS_TEL) VALUES (4,'KALUTARA','ROHAN','PERERA','13/2, Colombo Fort South Sri Lanka',15000,'WESTERN','+94-11-2343334');
INSERT INTO CUSTOMER(CUS_ID,CUS_CITY, CUSFNAME,CUSLNAME,CUS_ADDRESS,CUS_POSTAL_CODE,CUS_STATE,CUS_TEL) VALUES (5,'KALUTARA','VIJAYA','PERERA','14/2, Wijerama Mawatha Sri Lanka',16000,'WESTERN','+94-11-2440584');


INSERT INTO PAYMENT(PAYMENT_ID,CUS_ID,PAYMENT_DATE,PAYMENT_AMOUNT) VALUES (1,1,'2020-05-01',250);
INSERT INTO PAYMENT(PAYMENT_ID,CUS_ID,PAYMENT_DATE,PAYMENT_AMOUNT) VALUES (2,2,'2020-05-02',300);
INSERT INTO PAYMENT(PAYMENT_ID,CUS_ID,PAYMENT_DATE,PAYMENT_AMOUNT) VALUES (3,3,'2020-05-03',400);
INSERT INTO PAYMENT(PAYMENT_ID,CUS_ID,PAYMENT_DATE,PAYMENT_AMOUNT) VALUES (4,4,'2020-05-04',500);
INSERT INTO PAYMENT(PAYMENT_ID,CUS_ID,PAYMENT_DATE,PAYMENT_AMOUNT) VALUES (5,5,'2020-05-05',600);


INSERT INTO PRODUCT(PRODUCT_ID,PROD_PRICE,PROD_QTY_IN_STOCK,PRODUCT_DESCRIPTION,PRODUCT_NAME) VALUES(1,360,4,'Ice Coffee with Chocolate','Chocolate Ice Coffe');
INSERT INTO PRODUCT(PRODUCT_ID,PROD_PRICE,PROD_QTY_IN_STOCK,PRODUCT_DESCRIPTION,PRODUCT_NAME) VALUES(2,400,4,'Ice Coffee with VANILLA','Vanilla Ice Coffe');
INSERT INTO PRODUCT(PRODUCT_ID,PROD_PRICE,PROD_QTY_IN_STOCK,PRODUCT_DESCRIPTION,PRODUCT_NAME) VALUES(3,500,4,'Ice Coffee with Icecream','Icecream Ice Coffe');
INSERT INTO PRODUCT(PRODUCT_ID,PROD_PRICE,PROD_QTY_IN_STOCK,PRODUCT_DESCRIPTION,PRODUCT_NAME) VALUES(4,600,4,'Ice Coffee with Strawberry','Strawberry Ice Coffe');
INSERT INTO PRODUCT(PRODUCT_ID,PROD_PRICE,PROD_QTY_IN_STOCK,PRODUCT_DESCRIPTION,PRODUCT_NAME) VALUES(5,360,4,'Ice Coffee with Blueberry','Blueberry Ice Coffe');

INSERT INTO SHIPPING(SHIPPING_ID,COURIERCOMP_ID,ORDER_ID,SHIPPED_DATE,SHIPPING_STATUS) VALUES(1,1,1,'2020-04-23','Shipped');
INSERT INTO SHIPPING(SHIPPING_ID,COURIERCOMP_ID,ORDER_ID,SHIPPED_DATE,SHIPPING_STATUS) VALUES(2,2,2,'2020-04-24','In Transit');
INSERT INTO SHIPPING(SHIPPING_ID,COURIERCOMP_ID,ORDER_ID,SHIPPED_DATE,SHIPPING_STATUS) VALUES(3,3,3,'2020-04-25','Delivered');
INSERT INTO SHIPPING(SHIPPING_ID,COURIERCOMP_ID,ORDER_ID,SHIPPED_DATE,SHIPPING_STATUS) VALUES(4,4,4,'2020-04-26','Shipped');
INSERT INTO SHIPPING(SHIPPING_ID,COURIERCOMP_ID,ORDER_ID,SHIPPED_DATE,SHIPPING_STATUS) VALUES(5,5,5,'2020-04-27','Delivered');

