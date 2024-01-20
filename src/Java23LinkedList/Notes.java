package Java23LinkedList;

public class Notes {/*
List ..>> implement interface
(ArrayList + LinkedList) ..>> They are names classes of interface
-List allow duplicate data

*ArrayList
1/Store data in consecutive memory location(no spaces)
-if i want retrieve element i can skip all elements before that element
-super fast to visit the element
-Memory is fixed if i want to insert or remove element you have to reorganize every thing again
(if you will remove data 90% but insert data 10% use ArrayList)



*LinkedList
1/Store data not in consecutive memory but with index for each element(there are spaces)
manages a pointer to tell us which element the first, second, third
-if i want retrieve element i have to go through all elements before that element
-way slow to visit the element
-easily we can insert and remove element without moving data
(if you will remove data 10% but insert data 90% use LinkedList)



Set ..>> itself interface

*HashSet             fast
 HashSet ...>> This is name class of interface
-Set not allow duplicate data
//Hash set do not store duplicate element . print data randomly
// there is not order print out randomly >> so no get index method
No guarantee that you will get thing first as well
(fast but dont store the data in order)


*LinkedHashSet     slower than Hash
-Set not allow duplicate data
-Store the data in order.Keeps the data in original order
(Slower than HashSet)  ..>>  Between LinkedList and HashSet
-// no get index method




*TreeSet   slow
-It Keep the Data sorted always (numbers+ Alphabet)
-Inserting new elements is very slow because it figure out where element should be placed
// no get index method


HashSet ......   Remove duplicate  & not keep insertion order is maintained (if we are not caring insertion order use HashSet)
LinkedHashSet .....  Remove duplicate  & keep insertion order is maintained
TreeSet ...... Remove duplicate  & Sort elements alphabet or numbers
*/
}
