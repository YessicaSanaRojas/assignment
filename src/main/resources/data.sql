INSERT INTO COLLEGUE (ID, NAME) VALUES (1, 'El colegio del Olimpo');
INSERT INTO GRADE (ID, NAME, ID_COLLEGUE ) VALUES (1, '10A', 1);
INSERT INTO GRADE (ID, NAME, ID_COLLEGUE ) VALUES (2, '10B', 1);
INSERT INTO GRADE (ID, NAME, ID_COLLEGUE ) VALUES (3, '11A', 1);
INSERT INTO GRADE (ID, NAME, ID_COLLEGUE ) VALUES (4, '11B', 1);

INSERT INTO TEACHER (ID, NAME) VALUES (1, 'Némesis');
INSERT INTO TEACHER (ID, NAME) VALUES (2, 'Príapo');
INSERT INTO TEACHER (ID, NAME) VALUES (3, 'Iris');

INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (1, 'Matemáticas', 1, 1);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (2, 'Matemáticas', 2, 1);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (3, 'Matemáticas', 3, 1);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (4, 'Matemáticas', 4, 1);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (5, 'Español', 1, 2);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (6, 'Español', 2, 2);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (7, 'Ingles básico', 1, 3);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (8, 'Ingles avanzado', 2, 3);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (9, 'Pre Icfes', 3, 1);
INSERT INTO SIGNATURE (ID, NAME, ID_GRADE, ID_TEACHER) VALUES (10, 'Pre Icfes', 4, 1);

INSERT INTO STUDENT (ID, NAME) VALUES (1, 'Afrodita');
INSERT INTO STUDENT (ID, NAME) VALUES (2, 'Apolo');
INSERT INTO STUDENT (ID, NAME) VALUES (3, 'Ares');
INSERT INTO STUDENT (ID, NAME) VALUES (4, 'Artemisa');
INSERT INTO STUDENT (ID, NAME) VALUES (5, 'Atenea');
INSERT INTO STUDENT (ID, NAME) VALUES (6, 'Dionisio');
INSERT INTO STUDENT (ID, NAME) VALUES (7, 'Hefesto');
INSERT INTO STUDENT (ID, NAME) VALUES (8, 'Hera');
INSERT INTO STUDENT (ID, NAME) VALUES (9, 'Hermes');
INSERT INTO STUDENT (ID, NAME) VALUES (10, 'Hades');
INSERT INTO STUDENT (ID, NAME) VALUES (11, 'Poseidón');
INSERT INTO STUDENT (ID, NAME) VALUES (12, 'Zeus');

INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES (1, 0, 1, 1);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 5, 1);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 7, 1);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 1, 2);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 5, 2);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 7, 2);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 1, 3);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 5, 3);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 7, 3);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 2, 4);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 6, 4);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 8, 4);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 2, 5);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 6, 5);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 8, 5);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 2, 6);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 6, 6);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 8, 6);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 3, 7);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 9, 7);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 3, 8);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 9, 8);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 4, 9);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 10, 9);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 4, 10);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 10, 10);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 4, 11);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 10, 11);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 4, 12);
INSERT INTO SIGNATURE_STUDENT (ID_SIGNATURE_STUDENT, NOTE, ID_SIGNATURE, ID_STUDENT) VALUES ((SELECT (MAX(ID_SIGNATURE_STUDENT) + 1) FROM SIGNATURE_STUDENT), 0, 10, 12);


