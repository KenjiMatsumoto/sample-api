DROP TABLE IF EXISTS currency;

-- 簡易なマスタテーブル
CREATE TABLE currency (
  id serial NOT NULL,
  name VARCHAR(64) NOT NULL,
  symbol VARCHAR(10) NOT NULL,
  amount DECIMAL(40, 20),
  PRIMARY KEY (id)
) ;