package ru.netology.afisha.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    String film1 = "Number one";
    String film2 = "Number two";
    String film3 = "Number three";
    String film4 = "Number four";
    String film5 = "Number five";
    String film6 = "Number six";
    String film7 = "Number seven";
    String film8 = "Number eight";
    String film9 = "Number nine";
    String film10 = "Number ten";
    String film11 = "Number eleven";
    String film12 = "Number twelve";


    @Test
    public void shouldFindAllAddedFilms() {

        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindOneAddedFilm() {

        Manager manager = new Manager();
        manager.addFilm(film1);

        String[] expected = {film1};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNotAddFilmsIfNoFilms() {

        Manager manager = new Manager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedFilmsInReverseOrderInLimit() {

        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] expected = {film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedFilmsInReverseOrderMoreTheInLimit() {

        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastAddedFilmsInReverseOrderLessHheLimit() {

        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);

        String[] expected = {film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastAddedFilmsInReverseOrderEqualHheLimit() {

        Manager manager = new Manager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastAddedFilmsInReverseOrderInNonDefaultLimit() {

        Manager manager = new Manager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {film10, film9, film8, film7, film6};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNotFindLastAddedFilmsInReverseOrderIfNoFilms() {

        Manager manager = new Manager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedFilmInReverseOrderIfFilmOne() {

        Manager manager = new Manager();
        manager.addFilm(film1);

        String[] expected = {film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
