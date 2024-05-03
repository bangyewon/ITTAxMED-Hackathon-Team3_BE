CREATE TABLE Calories
(
    age_group    VARCHAR(10),
    gender       VARCHAR(10),
    min_calories INT,
    max_calories INT,
    CONSTRAINT pk_calories PRIMARY KEY (age_group, gender)
);

CREATE TABLE Carbohydrates
(
    age_group         VARCHAR(10),
    gender            VARCHAR(10),
    min_carbohydrates INT,
    max_carbohydrates INT,
    CONSTRAINT pk_carbohydrates PRIMARY KEY (age_group, gender)
);

CREATE TABLE Proteins
(
    age_group    VARCHAR(10),
    gender       VARCHAR(10),
    min_proteins INT,
    max_proteins INT,
    CONSTRAINT pk_proteins PRIMARY KEY (age_group, gender)
);

CREATE TABLE Fats
(
    age_group VARCHAR(10),
    gender    VARCHAR(10),
    min_fats  INT,
    max_fats  INT,
    CONSTRAINT pk_fats PRIMARY KEY (age_group, gender)
);

CREATE TABLE Cholesterol
(
    min_cholesterol INT,
    max_cholesterol INT,
    CONSTRAINT pk_cholesterol PRIMARY KEY (min_cholesterol, max_cholesterol)
);

CREATE TABLE SaturatedFats
(
    age_group          VARCHAR(10),
    gender             VARCHAR(10),
    min_saturated_fats INT,
    max_saturated_fats INT,
    CONSTRAINT pk_saturated_fats PRIMARY KEY (age_group, gender)
);

CREATE TABLE TransFats
(
    age_group      VARCHAR(10),
    gender         VARCHAR(10),
    min_trans_fats INT,
    max_trans_fats INT,
    CONSTRAINT pk_trans_fats PRIMARY KEY (age_group, gender)
);

CREATE TABLE Sugars
(
    min_sugars INT,
    max_sugars INT,
    CONSTRAINT pk_sugars PRIMARY KEY (min_sugars, max_sugars)
);

CREATE TABLE Sodium
(
    age_group  VARCHAR(10),
    min_sodium INT,
    max_sodium INT,
    CONSTRAINT pk_sodium PRIMARY KEY (age_group)
);

INSERT INTO Calories (age_group, gender, min_calories, max_calories)
VALUES ('유아', '1-2', 900, 1170),
       ('유아', '3-5', 1400, 1820),
       ('남자', '6-8', 1700, 2210),
       ('여자', '6-8', 1500, 1950);

INSERT INTO Carbohydrates (age_group, gender, min_carbohydrates, max_carbohydrates)
VALUES ('유아', '1-2', GREATEST(130, (900 * 0.55)), 900 * 0.65),
       ('유아', '3-5', GREATEST(130, (1400 * 0.55)), 1400 * 0.65),
       ('남자', '6-8', GREATEST(130, (1700 * 0.55)), 1700 * 0.65),
       ('여자', '6-8', GREATEST(130, (1500 * 0.55)), 1500 * 0.65);

INSERT INTO Proteins (age_group, gender, min_proteins, max_proteins)
VALUES ('유아', '1-2', GREATEST(20, (900 * 0.07)), 900 * 0.2),
       ('유아', '3-5', GREATEST(25, (1400 * 0.07)), 1400 * 0.2),
       ('남자', '6-8', GREATEST(35, (1700 * 0.07)), 1700 * 0.2),
       ('여자', '6-8', GREATEST(35, (1500 * 0.07)), 1500 * 0.2);

INSERT INTO Fats (age_group, gender, min_fats, max_fats)
VALUES ('유아', '1-2', 900 * 0.2, 900 * 0.35),
       ('유아', '3-5', 1400 * 0.15, 1400 * 0.3),
       ('남자', '6-8', 1700 * 0.15, 1700 * 0.3),
       ('여자', '6-8', 1500 * 0.15, 1500 * 0.3);

INSERT INTO Cholesterol (min_cholesterol, max_cholesterol)
VALUES (0, 300);

INSERT INTO SaturatedFats (age_group, gender, min_saturated_fats, max_saturated_fats)
VALUES ('유아', '1-2', 0, 0),
       ('유아', '3-5', 0, 1400 * 0.08),
       ('남자', '6-8', 0, 1700 * 0.08),
       ('여자', '6-8', 0, 1500 * 0.08);

INSERT INTO TransFats (age_group, gender, min_trans_fats, max_trans_fats)
VALUES ('유아', '1-2', 0, 0),
       ('유아', '3-5', 0, 1400 * 0.01),
       ('남자', '6-8', 0, 1700 * 0.01),
       ('여자', '6-8', 0, 1500 * 0.01);

INSERT INTO Sugars (min_sugars, max_sugars)
VALUES (0, 900 * 0.2);

INSERT INTO Sodium (age_group, min_sodium, max_sodium)
VALUES ('유아', 810, 1200),
       ('유아', 1000, 1600),
       ('남자', 1200, 1900),
       ('여자', 1200, 1900);
