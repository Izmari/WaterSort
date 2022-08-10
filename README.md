# Development
We designed the game Watersort in Java during my CMPG221 course.

## <heading 2 - Explain how the game watersort works>
You have an x amount of water bottles and you need to fill the water bottles with the same colour water. In order to check if a game is completed one needs to check if all the colours in a bottle are the same. 

### <heading 3 - Explain the MyArrayList File>
The method checkUniform(): The method returns true if all the filled entries are identical. Firstly, if the water bottle is empty return true else you compare every element (water colour) in the water bottle with the first colour in the bottle (the first element). You compare the elements by using a for the traverse the list of elements.)
The method getSize(): is an accessor for the instance variable.
The methode remove(): is there to remove an element from the water bottle. Firstly if the player enters a index smaller then 0 or larger then the size it will through a new index out of bound exception else, it will remove the element and shift all the data to the left. Then decrement the size of the number of elements.
The methode add(): to add an element to a bottle. Firstly if the player enters a index smaller then 0 or larger then the size it will through a new index out of bound exception else, it will move the elements to tthe right after specified index. Increase the ize by one, because an element was added.

#### <heading 4 - Explain the StackAsMyArrayList File>
Firstly I created a stack. 
The method push(): to insert an element at the end of array.
The method pop(): remove an elment from the end of the array.
The method peek(): remove end of array.


