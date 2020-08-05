package com.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class CollectionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void collection() {
        int fourCount = 25;
        List<Integer> cohortCount = new ArrayList();
        cohortCount.add(fourCount);
        Integer constructorCount = 45;
        cohortCount.add(constructorCount);
        String foursPriest = "Samuel";

        int constructors = cohortCount.get(1);
        assertEquals(45, constructors);
        Iterator<Integer> countIterator = cohortCount.iterator();
        while (countIterator.hasNext()) {
            System.out.println(countIterator.next());
        }
        for (Integer count : cohortCount) {
            System.out.println(count);
        }

        List<String> agentOfTheGods = new Vector<String>();
        agentOfTheGods.add(foursPriest);

        Set<String> fours = new HashSet<String>();
        boolean result = fours.add(foursPriest);
        assertTrue(result);
        result = fours.add("Nike");
        assertTrue(result);
        result = fours.add("Samuel");
        assertFalse(result);
        result = fours.add("Nike");
        assertFalse(result);
        result = fours.add("Raphael");
        assertTrue(result);

        boolean isolated = fours.remove("Raphael");
        assertTrue(isolated);

        assertFalse(fours.isEmpty());
        Iterator<String> foursIterator = fours.iterator();
        while(foursIterator.hasNext()) {
            System.out.println(foursIterator.next());
        }
        fours.clear();
        assertTrue(fours.isEmpty());

        Map<String, String> nativesIds = new TreeMap<String, String>();
        String value = nativesIds.put("SCV4015", "Bernard");
        assertNull(value);
        value = nativesIds.put("SCV4028", foursPriest);
        assertNull(value);
        value = nativesIds.put("SCV4028", "Love");
        assertEquals("Samuel", value);
    }

    @Test
    void collectionFactories() {
        List<String> gadans = List.of("Samuel", "Bernard", "Deborah", "Joanna", "Raphael");
        assertFalse(gadans.isEmpty());
        assertEquals(5, gadans.size());

        Set<String> gadansId = Set.of("SCV4028", "SCV4015");
        assertFalse(gadansId.isEmpty());

        Map<String, Integer> gadansMarks = Map.of("Samuel", 80, "Chima", 20);
        Set<String> marksKeys = gadansMarks.keySet();
        assertEquals(2, marksKeys.size());
        assertTrue(gadansMarks.containsKey("Samuel"));
    }

    public static void main(String[] args) {
        // add elements in colors array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for (String color : colors)
            list.add(color); // adds color to end of list

        // add elements in removeColors array to removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for (String color : removeColors)
            removeList.add(color);

        // output list contents
        System.out.println("ArrayList: ");

        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s ", list.get(count));

        // remove from list the colors contained in removeList
        removeColors(list, removeList);

        // output list contents
        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for (String color : list)
            System.out.printf("%s ", color);
    }

    // remove colors specified in collection2 from collection1
    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        // get iterator
        Iterator<String> iterator = collection1.iterator();

        // loop while collection has items
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next()))
                iterator.remove(); // remove current element
        }
    }
} // end class CollectionTest
