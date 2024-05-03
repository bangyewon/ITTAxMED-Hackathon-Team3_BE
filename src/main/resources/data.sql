-- 열량
CREATE TABLE Calories
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_calories INT,
    max_calories INT
);

-- 탄수화물
CREATE TABLE Carbohydrates
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_carbohydrates FLOAT,
    max_carbohydrates FLOAT
);

-- 단백질
CREATE TABLE Proteins
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_proteins FLOAT,
    max_proteins FLOAT
);

-- 지방
CREATE TABLE Fats
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_fats FLOAT,
    max_fats FLOAT
);

-- 콜레스테롤
CREATE TABLE Cholesterol
(
    id INT PRIMARY KEY,
    min_cholesterol INT,
    max_cholesterol INT
);

-- 포화지방
CREATE TABLE SaturatedFats
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_saturated_fats INT,
    max_saturated_fats FLOAT
);

-- 트랜스지방
CREATE TABLE TransFats
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_trans_fats INT,
    max_trans_fats FLOAT
);

-- 당류
CREATE TABLE Sugars
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_sugars INT,
    max_sugars FLOAT
);

-- 나트륨
CREATE TABLE Sodium
(
    id INT PRIMARY KEY,
    min_age INT,
    max_age INT,
    min_sodium INT,
    max_sodium INT
);

-- 열량
INSERT INTO Calories (id, min_age, max_age, min_calories, max_calories)
VALUES
    (1, 1, 2, 900, 1170),
    (2, 3, 5, 1400, 1820),
    (3, 6, 8, 1700, 2210);

-- 탄수화물
INSERT INTO Carbohydrates (id, min_age, max_age, min_carbohydrates, max_carbohydrates)
VALUES
    (1, 1, 2, 130, 30),
    (2, 3, 5, 130, 30),
    (3, 6, 8, 130, 30);

-- 단백질
INSERT INTO Proteins (id, min_age, max_age, min_proteins, max_proteins)
VALUES
    (1, 1, 2, 20, 8),
    (2, 3, 5, 25, 8),
    (3, 6, 8, 35, 8);

-- 지방
INSERT INTO Fats (id, min_age, max_age, min_fats, max_fats)
VALUES
    (1, 1, 2, 8, 10),
    (2, 3, 5, 8, 10),
    (3, 6, 8, 8, 10);

-- 콜레스테롤 <나이 상관 없음>
INSERT INTO Cholesterol (id, min_cholesterol, max_cholesterol)
VALUES (1, 0, 300);

-- 포화지방산
INSERT INTO SaturatedFats (id, min_age, max_age, min_saturated_fats, max_saturated_fats)
VALUES
    (1, 1, 2, 0, 0),
    (2, 3, 5, 0, 12),
    (3, 6, 8, 0, 12);

-- 트랜스지방
INSERT INTO TransFats (id, min_age, max_age, min_trans_fats, max_trans_fats)
VALUES
    (1, 1, 2, 0, 0),
    (2, 3, 5, 0, 0),
    (3, 6, 8, 0, 0);

-- 당
INSERT INTO Sugars (id, min_age, max_age, min_sugars, max_sugars)
VALUES (1, 1, 5, 0, 10);

-- 나트륨
INSERT INTO Sodium (id, min_age, max_age, min_sodium, max_sodium)
VALUES
    (1, 1, 2, 810, 1200),
    (2, 3, 5, 1000, 1600),
    (3, 6, 8, 1200, 1900);