#1
#A normalização é o processo de desenvolvimento, difusão e aplicação de normas técnicas, 
#para a solução ou prevenção de problemas, com a participação de todos os interessados, 
#para a promoção da economia global.

#2
INSERT INTO movies (title, rating, awards, release_date, length, genre_id) VALUES ('Procurando nemo', 8.9, 3, '2005-07-04 00:00:00'  , 100, 7);

#3
INSERT INTO genres (name , ranking, active ) VALUES ('Comedia romantica', 13, 1);

#4
UPDATE movies
SET genre_id = 14
WHERE id = 22;

#5
UPDATE actors
SET favorite_movie_id = 22
WHERE id = 2;

#6
CREATE VIEW visual_movies AS
SELECT id,title, rating, awards, release_date, length, genre_id
FROM movies;

#7
DELETE FROM visual_movies
WHERE awards < 5;

#8
SELECT DISTINCT g.name 
FROM genres AS g
INNER JOIN movies AS m
ON m.genre_id = g.id 
WHERE m.genre_id != 'null';

#9
SELECT a.first_name, a.last_name 
FROM actors AS a
INNER JOIN movies AS m
ON m.id = a.favorite_movie_id 
WHERE m.awards > 3;

#10
#Plano de execução é definido como uma maneira simples do 
#query optimizer calcular o caminho mais eficiente para 
#implementar uma requisição representada pelo T-SQL, 
#quando esta for submetida dentro SQL Server.

#11
#O uso de índices pode trazer grandes melhorias para o 
#desempenho do banco de dados. Pensando nisso, devemos 
#então, primeiramente, entender como funciona o mecanismo 
#que está trabalhando nos bastidores.

