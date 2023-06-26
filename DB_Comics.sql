create database ComicsDB;
use ComicsDB;

create table Comics (
   id int auto_increment primary key,
   titulo varchar(100),
   autor varchar(100),
   editorial varchar(100),
   anio_publicacion int,
   precio decimal(8, 2)
);

insert into Comics (titulo, autor, editorial, anio_publicacion, precio)
values 
   ('Transformers: More Than Meets the Eye', 'James Roberts', 'IDW Publishing', 2012, 17.47),
   ('Halo: Escalation', 'Brian Reed', 'Dark Horse Comics', 2013, 13.97),
   ('Terminator: Secondary Objectives', 'James Robinson', 'Dark Horse Comics', 1991, 10.47),
   ('Batman: Year One', 'Frank Miller', 'DC Comics', 1987, 34.97),
   ('The Flash: Rebirth', 'Geoff Johns', 'DC Comics', 2009, 17.47),
   ('Avengers: Disassembled', 'Brian Michael Bendis', 'Marvel Comics', 2004, 20.97),
   ('Spider-Man: Kraven''s Last Hunt', 'J.M. DeMatteis', 'Marvel Comics', 1987, 17.47),
   ('X-Men: Days of Future Past', 'Chris Claremont', 'Marvel Comics', 1981, 20.97),
   ('Superman: Red Son', 'Mark Millar', 'DC Comics', 2003, 34.97),
   ('The Walking Dead', 'Robert Kirkman', 'Image Comics', 2003, 13.97),
   ('Hellboy', 'Mike Mignola', 'Dark Horse Comics', 1993, 17.47),
   ('Saga', 'Brian K. Vaughan', 'Image Comics', 2012, 20.97),
   ('Wonder Woman: The Hiketeia', 'Greg Rucka', 'DC Comics', 2002, 13.97),
   ('Daredevil: Born Again', 'Frank Miller', 'Marvel Comics', 1986, 17.47),
   ('Sandman', 'Neil Gaiman', 'DC Comics', 1989, 24.47),
   ('The Killing Joke', 'Alan Moore', 'DC Comics', 1988, 24.47),
   ('Preacher', 'Garth Ennis', 'Vertigo Comics', 1995, 17.47),
   ('Spawn', 'Todd McFarlane', 'Image Comics', 1992, 13.97),
   ('Y: The Last Man', 'Brian K. Vaughan', 'Vertigo Comics', 2002, 20.97),
   ('Captain America: The Winter Soldier', 'Ed Brubaker', 'Marvel Comics', 2005, 17.47),
   ('Astro City', 'Kurt Busiek', 'Vertigo Comics', 1995, 13.97),
   ('Invincible', 'Robert Kirkman', 'Image Comics', 2003, 17.47);
select * from Comics;