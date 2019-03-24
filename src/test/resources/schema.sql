CREATE SCHEMA if not exists payroll;
DROP TABLE IF EXISTS payroll.goods;
CREATE TABLE payroll.goods (
  id      INTEGER,
  name    VARCHAR,
  price   DOUBLE PRECISION,
);
DROP TABLE IF EXISTS payroll.order_line;
CREATE TABLE payroll.order_line(
  id      INTEGER,
  order_id INTEGER,
  goods_id INTEGER,
  goods_count INTEGER,
);
DROP TABLE IF EXISTS payroll.order_table;
CREATE TABLE payroll.order_table(
  id      INTEGER,
  client VARCHAR,
  address VARCHAR,
  DATE DATE,
);

