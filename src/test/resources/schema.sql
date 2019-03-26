CREATE SCHEMA if not exists payroll;
DROP TABLE IF EXISTS payroll.goods;
CREATE TABLE payroll.goods (
  id      INTEGER,
  name    VARCHAR,
  price   DOUBLE PRECISION,
);
DROP TABLE IF EXISTS payroll.orderLine;
CREATE TABLE payroll.orderLine(
  id        INTEGER,
  goodsId  INTEGER,
  orderId  INTEGER,
  count     INTEGER,
);
DROP TABLE IF EXISTS payroll.orderTable;
CREATE TABLE payroll.orderTable(
  id      INTEGER,
  client  VARCHAR,
  address VARCHAR,
  date    DATE,
);
