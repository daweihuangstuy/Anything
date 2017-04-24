# Anything
# Roster: Dawei Huang and Karina Ionkina

## Intefaces
1. Comparable
2. PriorityQueue

## Class Ticket implements Comparable<t>
1. Ticket(int id, int vip)

//accessor

2. int getID() - returns ticket ID
3. Integer getVIPlvl() - returns VIP level

//mutators

4. void solve() - designates the ticket as solved
5. void setSolution(String s) - adds the solution to the ticket
6. int compareTo(Ticket T) - returns 0 if ticket T has the same vip level as this ticket
                           - returns 1 if ticket T has a lower vip level as this ticket
                           - returns -1 if ticket T has a greater vip level as this ticket

## Class ArrayPriorityQueue

//accessor

1. boolean isEmpty() - returns true if the queue is empty, return false otherwise
2. Ticket peekMin() - returns the next ticket on the queue
3. String toString() -  returns a string representation of the Ticket queue

//mutator
4. void add(Ticket x) - adds ticket to the queue of tickets organized by the binary search/place 5. 
5. Ticket removeMin() - removes and returns the next ticket on the queue

## Class HelpDesk
1. HelpDesk() - sets the next ticket to be processed as the ticket at the front of the queue
