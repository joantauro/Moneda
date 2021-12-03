DROP TABLE IF EXISTS Moneda;
CREATE TABLE Moneda(id INT AUTO_INCREMENT  PRIMARY KEY,
			monedaorigen varchar(250),
			monedadestino varchar(250), 
			tipocambio NUMERIC(20, 2)
			);

insert into Moneda (monedaorigen,monedadestino,tipocambio) values ('PEN','USD',0.25);
insert into Moneda (monedaorigen,monedadestino,tipocambio) values ('PEN','EUR',0.22);

insert into Moneda (monedaorigen,monedadestino,tipocambio) values ('USD','PEN',4.07);
insert into Moneda (monedaorigen,monedadestino,tipocambio) values ('USD','EUR', 0.88);

insert into Moneda (monedaorigen,monedadestino,tipocambio) values ('EUR','USD',1.13);
insert into Moneda (monedaorigen,monedadestino,tipocambio) values ('EUR','PEN',4.60);

