DROP TRIGGER if EXISTS mytrigger;
CREATE TRIGGER per_trigger AFTER INSERT ON person
  for EACH ROW
BEGIN
	INSERT INTO person_status(ID,PERSON_ID)VALUES(new.id,new.id);
END