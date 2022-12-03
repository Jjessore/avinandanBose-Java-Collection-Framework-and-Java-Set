# JavaCollectionFramework
This is all about Java Collection.


<h3> <i> java.util </i> →Package contains  the collection classes let us to group elements in various ways . The Collection Classes also define several methods that provide easier way of working with items . These classes are important , not just for their but because many other Java methods use or return objects of these classes such as the <i>ArrayList</i> and <i>HashMap</i> classes. Collection package added to JSE 1.2 Java SE 8 has significantly increased the power and streamlined the use of collection framework. </h3>

<h2> <ins> The Collection Framework Interfaces </ins></h2>
<ul>
  <li><h3>1.Collection</h3> </li>
  <li><h3>2.Deque</h3> </li>
  <li><h3>3.List</h3> </li>
  <li><h3>4.Set</h3> </li>
  <li><h3>5.Map</h3> </li>
  <li><h3>6.Sorted Set</h3> </li>
  <li><h3>7.Sorted Map</h3> </li>
  <li><h3>8.Queue</h3> </li>
  <li><h3>9.Navigable Set</h3> </li>
</ul>

<h2> <ins>1. The Collection Interface </ins> </h2>

<br>
  
```Syntax

Collection: It is the top of the collection hierarchy. It supports basic grouping of elements.

```
<ul>
<ul>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/javacollection1.java" > Java Collection [Eg -1]</a></h3>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/javacollection2.java" > Java Collection [Eg -2]</a></h3>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/javacollection3.java" > Java Collection [Eg -3]</a></h3>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/javacollection4.java" > Java Collection [Eg -4]</a></h3>
</ul>

<table>
 <tr>
    <th>Interface</th>
    <th>Hash Table</th>
    <th>Resizable Array</th> 
   <th>Balanced Tree</th> 
   <th>Linked List</th> 
</tr> 
<tr>
  <td >Collection</td>
  <td >HashSet</td> 
  <td >ArrayList</td> 
  <td >TreeSet</td>
  <td >Linked List</td>
</tr>
</table>
  
<h3>  
 
```Syntax

That is we can create an instance of HashSet, ArrayList, TreeSet 
and LinkedList Class,through the help of Collection interface.


```

<h2> <ins> 2 . Sets </ins></h2>  
  
  
```mermaid
graph TD;
    Collection-->Set;
    Set-->HashSet;
    Set-->SortedSet;
    HashSet-->LinkedListSet;
    SortedSet-->NavigableSet;
    NavigableSet-->TreeSet;
    
```

  ```Syntax

Collection: It is the top of the collection hierarchy. It supports basic grouping of elements.
  
Set: It extends Collection to implement sets, in which all elements must be unique.
  
SortedSet: It extends Set to implement a sorted set.
  
HashSet:  It extends Set to implement a hash set.

LinkedListSet:   It extends HashSet to implement a Linked List Set.

NavigableSet:   It extends SortedSet to implement a Navigable Set.
  
Tree Set:   It extends NavigableSet to implement a Tree Set.
```

```mermaid
graph TD;
    
    Set-->HashSet;
    Set-->TreeSet;
   
    
```
  
<table>
 <tr>
    <th>Interface</th>
    <th>Hash Table</th>
    <th>Resizable Array</th> 
   <th>Balanced Tree</th> 
   <th>Linked List</th> 
</tr> 
<tr>
  <td >Set</td>
  <td >HashSet</td> 
  <td ></td> 
  <td >TreeSet</td>
  <td ></td>
</tr>
</table>  

<ul>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/setDemo.java" > Set→HashSet [Eg -1]</a></h3>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/setDemo1.java" >  Set→TreeSet  [Eg -2]</a></h3>


```Syntax

That is we can create an instance of TreeSet, HashSet,
through the help of Set Interface.

:HashSet:
___________
→It implements Set Interface.
→ Every elements entered are unique i.e. No duplicates.
→ HashSet stores the elements by using a mechanism called hashing.
→ HashSet allows null value.
→ HashSet doesn't maintain the insertion order. 
  Here, elements are inserted on the basis of their hashcode.
  
:TreeSet:
___________
→It implements Set Interface.
→TreeSet class access and retrieval times are quiet fast.
→TreeSet class doesn't allow null element.
→TreeSet class maintains ascending order. 
→TreeSet class contains unique elements only like HashSet.
```

<h2> Calculation of HashCode  </h3>
<ul>
<li><h3> 1. Integers </h3> </li>
<ul>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/hashcodeDemo1.java" > HashCode Of Integers [Eg -1]</a></h3>
</ul>
<li><h3> 2. Strings </h3> </li>
<ul>
<h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/hashcodeDemo2.java" > HashCode Of Strings [Eg -2]</a></h3>
</ul>


```Syntax

:HASH CODE OF INTEGERS:

HASH CODE OF 1 → 1
HASH CODE OF 2 → 2
HASH CODE OF 3 → 3

                  ......etc.
                  
:HASH CODE OF STRINGS:

HASH CODE OF A → 65 //ASCII CODE
HASH CODE OF B → 66 //ASCII CODE
HASH CODE OF C → 67 //ASCII CODE
                    ......etc.

```

</ul>
  
<h1 align="center">  HashSet Functionality:  </h1>
 <ul>
   <li> <h3> 1. Add </h3> </li>
   <ul>
     <h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo.java" > HashSet [Add]</a></h3>
    </ul>
    
```Syntax
      Adds the specified element to this set if it is not already present. 
     More formally, adds the specified element e to this set if this set ,
     contains no element e2 such that Objects.equals(e, e2). 
     If this set already contains the element, the call leaves 
     the set unchanged and returns false.     
````

    
    
<li> <h3> 2. Remove </h3> </li>
   <ul>
     <h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo1.java" > HashSet [Remove]</a></h3>
    </ul>
    
```Syntax
      Removes the specified element from this set if it is present. 
      More formally, removes an element e such that Objects.equals(o, e), 
      if this set contains such an element. 
      Returns true if this set contained the element.     
````

<li> <h3> 3. Clear </h3> </li>
   <ul>
     <h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo2.java" > HashSet [Clear]</a></h3>
    </ul>
 
 ```Syntax
      Removes all of the elements from this set. 
      The set will be empty after this call returns. 
````
    
   <li> <h3> 4. Clone </h3> </li>
   <ul>
     <h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo3.java" > HashSet [Clone]</a></h3>
    </ul>
    
```Syntax
      Returns a shallow copy of this HashSet instance: the elements themselves are not cloned.
````    
    
<li> <h3> 5. Iterator </h3> </li>
   <ul>
     <h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo4.java" > HashSet [Iterator]</a></h3>
     <ul>
     
```Syntax
      Iterator: It iterates over the elements in the set. 
      The elements are returned in no particular order.
      
      Note: The double colon (::) operator, 
      also known as method reference operator.
      
      →Double Colon Operator is used to call a method,
      by referring to it with the help of its class directly.
````

<li><h3>a. HashSet [Iterator] → For Each Remaining</a></h3></li>
     <ul>
        <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo5.java" > For Each Remaining</a></h3></li>
     </ul>
     
```Syntax
     Performs the given action for each remaining element,
     until all elements have been processed or
     the action throws an exception. Actions are performed,
     in the order of iteration, if that order is specified. 
     Exceptions thrown by the action are relayed to the caller.
````

<li><h3>b. HashSet [Iterator] → hasNext</a></h3></li>
     <ul>
        <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo6.java" > hasNext</a></h3></li>
     </ul>
     
```Syntax
    Returns true if the iteration has more elements. 
    (In other words, returns true if next would return ,
    an element rather than throwing an exception.)
```` 

<li><h3>c. HashSet [Iterator] →Next</a></h3></li>
     <ul>
        <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo7.java" > Next</a></h3></li>
       <ul>
       
```Syntax
   Returns the next element in the iteration.
````

<li><h3>Next.CompareTo</h3></li>
         <ul>
           <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo9.java" >Next.CompareTo</a></h3></li>
         </ul>
         
```Syntax
  Compares two Integer objects numerically.
````

</ul>
</ul>
     

<li><h3>d. HashSet [Iterator] →remove</a></h3></li>
     <ul>
        <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo8.java" > Remove</a></h3></li>
     </ul>
     
```Syntax
  Removes from the underlying collection the last element,
  returned by this iterator (optional operation).
  This method can be called only once per call to next.
````

</ul>
<li><h3>6. HashSet →[Union]AddAll</h3></li>
<ul>
  <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo10.java" > [Union]AddAll</a></h3></li>
</ul>

```Syntax
 Adds all of the elements in the specified collection to this ,
 set if they're not already present (optional operation). 
 If the specified collection is also a set, the addAll operation,
 effectively modifies this set so that its value is the union of the two sets. 
 The behavior of this operation is undefined,
 if the specified collection is modified while the operation is in progress.
````

<li><h3>7. HashSet →[Intersection]RetainAll</h3></li>
<ul>
  <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo11.java" > [Intersection]RetainAll</a></h3></li>
</ul>

```Syntax
 Retains only the elements in this collection that are contained,
 in the specified collection (optional operation)[Intersection]. In other words, 
 removes from this collection all of its elements that are not ,
 contained in the specified collection.
````

<li><h3>8. HashSet →Spliterator</h3></li>
<ul>
  <li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/HashSetDemo12.java" > Spliterator</a></h3></li>
</ul>

```Syntax
 Returns a Spliterator over the elements in this set.
 Creates a late-binding and fail-fast Spliterator,
 over the elements in this set.A late-binding Spliterator,
 binds to the source of elements means HashSet,
 at the point of first traversal, first split,
 or first query for estimated size, 
 rather than at the time the Spliterator is created.
 ````
<li><h3>9. HashSet →Contains</h3></li>

<li><h3>10. HashSet →ContainsAll</h3></li>

<li><h3>11. HashSet →RemoveAll</h3></li>

<li><h3>12. HashSet →RemoveIf</h3></li>

<li><h3>13. HashSet →Stream</h3></li>

<li><h3>14. HashSet →ParallelStream</h3></li>

<li><h3>15. HashSet →toArray</h3></li>

</ul>
    
```mermaid

sequenceDiagram
    
  
  java.lang.Object->>java.util.AbstractCollection: 
  java.util.AbstractCollection->>java.util.AbstractSet: 
  java.util.AbstractSet->>java.util.HashSet: 
```

<h1>Abstract Set </h1>
<ul>
<li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/AbstractSetDemo.java" > AbstractSet</a></h3></li>

```Syntax
 We can create instance of HashSet from Abstract Set.
 AbstractSet class in Java is a part of the Java Collection Framework,
 which implements the Collection interface and extends,
 the AbstractCollection class. It provides a skeletal implementation,
 of the Set interface. 
 ````
 
</ul>


<h1>Abstract Collection </h1>
<ul>
<li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/AbstractCollectionDemo.java" > Abstract Collection</a></h3></li>

```Syntax
 We can create instance of HashSet from Abstract Collection.
 The AbstractCollection class in Java is a part of the ,
 Java Collection Framework and implements the Collection interface. 
 It is used to implement an unmodifiable collection, 
 for which one needs to only extend this AbstractCollection Class 
 and implement only the iterator and the size methods. 
 ````
 
</ul>

<h1>Object[java.lang.Object] </h1>
<ul>
<li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/ObjectSetDemo.java" > Object[java.lang.Object]-1</a></h3></li>
<li><h3><a href= "https://github.com/AvinandanBose/JavaCollectionFramework/blob/main/ObjectSetDemo1.java" > Object[java.lang.Object]-2</a></h3></li>

```Syntax
 We can create instance of HashSet from Object → [java.lang.Object].
 ````
 
</ul>


  </ul>
</ul>

</h3>

</ul>
