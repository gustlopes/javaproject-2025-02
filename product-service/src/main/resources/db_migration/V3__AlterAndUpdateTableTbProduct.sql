ALTER TABLE tb_product
ADD COLUMN image_url VARCHAR(255);

UPDATE tb_product SET image_url = 'https://example.com/images/ps5.jpg' WHERE model = 'PS5 825GB';
UPDATE tb_product SET image_url = 'https://example.com/images/ps2.jpg' WHERE model = 'PS2 Slim 32MB';
UPDATE tb_product SET image_url = 'https://example.com/images/pc.jpg' WHERE model = 'Roda joguinho e trava na calculadora';
UPDATE tb_product SET image_url = 'https://example.com/images/pcrgb.jpg' WHERE model = 'Roda tudo, menos Crysis';