SELECT Spørgsmål
FROM quizspørgsmål;

Insert INTO quizspørgsmål(id, spørgsmål, svar)
VALUES (5, 'hvordan sker den?', 'græder inden i');

UPDATE quizspørgsmål
SET spørgsmål = 'hvad sker der?', svar ='HJÆLP!'
WHERE id = 5;

DELETE FROM quizspørgsmål WHERE Svar ='HJÆLP!';


