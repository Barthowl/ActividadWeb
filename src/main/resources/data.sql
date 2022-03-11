insert into asignatura (id, nombre, descripcion, curso)
select 1, 'Lengua', 'Literatura y escritores', 2 from dual where not exists (select 1 from asignatura where id = 1);

insert into asignatura (id, nombre, descripcion, curso)
select 2, 'Matemáticas', 'Ecucacione y algebra', 1 from dual where not exists (select 1 from asignatura where id = 2);
