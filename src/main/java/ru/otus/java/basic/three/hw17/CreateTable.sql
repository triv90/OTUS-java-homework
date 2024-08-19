CREATE SCHEMA otus_test
    AUTHORIZATION pg_database_owner;

CREATE TABLE otus_test.test
(
    test_id serial NOT NULL,
    name character varying(256) NOT NULL,
    PRIMARY KEY (test_id),
    UNIQUE (test_name)
);

CREATE TABLE otus_test.question
(
    question_id serial NOT NULL,
    content text NOT NULL,
    test_id integer NOT NULL,
    PRIMARY KEY (question_id),
    FOREIGN KEY (test_id)
        REFERENCES otus_test.test (test_id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
);

CREATE TABLE otus_test.answer
(
    answer_id serial NOT NULL,
    content text NOT NULL,
    question_id integer NOT NULL,
    is_correct boolean NOT NULL,
    PRIMARY KEY (answer_id),
    FOREIGN KEY (question_id)
        REFERENCES otus_test.question (question_id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
);

-- Пример
INSERT INTO otus_test.test(test_id, name)
	VALUES (1, 'Test');

INSERT INTO otus_test.question(test_id, question_id, content)
	VALUES (1, 1, 'Вопрос 1?');
INSERT INTO otus_test.answer(question_id, answer_id, content, is_correct)
	VALUES (1, 1, 'Ответ 1_1', false);
INSERT INTO otus_test.answer(question_id, answer_id, content, is_correct)
	VALUES (1, 2, 'Ответ 1_2', false);
INSERT INTO otus_test.answer(question_id, answer_id, content, is_correct)
	VALUES (1, 3, 'Ответ 1_3', true);

INSERT INTO otus_test.question(test_id, question_id, content)
	VALUES (1, 2, 'Вопрос 2?');
INSERT INTO otus_test.answer(question_id, answer_id, content, is_correct)
	VALUES (2, 4, 'Ответ 2_1', false);
INSERT INTO otus_test.answer(question_id, answer_id, content, is_correct)
	VALUES (2, 5, 'Ответ 2_2', true);
INSERT INTO otus_test.answer(question_id, answer_id, content, is_correct)
	VALUES (2, 6, 'Ответ 2_3', false);

SELECT t.test_id, t.name FROM otus_test.test AS t;

SELECT q.question_id, q.content FROM otus_test.question AS q WHERE q.test_id = 1;

SELECT a.answer_id, a.content FROM otus_test.answer AS a WHERE a.question_id = 1;

SELECT q.content, a.content
    FROM otus_test.question AS q
    JOIN otus_test.answer AS a ON a.question_id = q.question_id
    WHERE q.test_id = 1 AND a.is_correct;