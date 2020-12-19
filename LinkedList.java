public class LinkedList {
    /**
* Removes the first matched object and
* returns the position of the removed object
* from the LinkedList.
*
* @param item represents the item the user wants to remove
* @return position of the removed item
*/


int remove(Object item) {

	Node current = start;//this needs to change depending on how I store starting node
	Node previous = null;
	int pos = 0;

	//search until it has reached the end of the list
	//I can make sure im  at the end by checking if the next value is null
	while(current.next != null){

		//first compare two values

		if(item.compareTo(current.item) == 0){
			// this if statement will execute if the objects are equal
			
			//you need to check if this was the first node
			if(pos == 0){
				//I need to set the start of the list to the next one

				//do that here


				//and then return pos
				return pos;
			}
			
			//in the case that it wasn't the first node set previous.next to current.next to remove the node from the list
			//this will remove the current node from the list

			//do that here

		}

		//increment previous current to the position
		previous = current;
		current = current.next;
		++pos;

	}

	//return -1 if an object isnt found
	return -1;

}

/**
* Removes the object given the position and
* returns the removed object from the LinkedList.
*
* @param position represents the position of the object
* to be removed
* @return the item that was removed
*/



Object remove(int position) {
	Node current = start;
	Node previous = null;
	int pos = 0;

	//loop until pos is equal to position or you've reached the end of the list
	while(current.next != null && pos < position){

		//increment previous current the the position
		previous = current;
		current = current.next;
		++pos;

	}

	

	if(pos == 0){
		//set the start of the list to the next one

		//do that here


		//return the object
		return current.item;
	}



	if(pos < position)
		return null;



	//link the previous node to the next one



	//return the current object

	return current.item;
	//current is the temp variable that's storing the object
}

}
