import array
import pytest

class Queue:
    def __init__(self, size_max):  # <-- corregido
        assert size_max > 0
        self.max = size_max
        self.head = 0
        self.tail = 0
        self.size = 0
        self.data = array.array('i', range(size_max))

    def empty(self):
        return self.size == 0

    def full(self):
        return self.size == self.max

    def enqueue(self, x):
        if self.size == self.max:
            return False
        self.data[self.tail] = x
        self.size += 1
        self.tail += 1
        if self.tail == self.max:
            self.tail = 0
        return True

    def dequeue(self):
        if self.size == 0:
            return None
        x = self.data[self.head]
        self.size -= 1
        self.head += 1
        if self.head == self.max:
            self.head = 0
        return x


# Pruebas usando pytest
def test_queue_operations():
    q = Queue(3)

    # Test 1: Verificar si la cola está vacía
    assert q.empty() == True

    # Test 2: Encolar un valor
    assert q.enqueue(10) == True
    assert q.enqueue(20) == True
    assert q.enqueue(30) == True



    # Test 3: Verificar que la cola esté llena
    assert q.full() == True

    # Test 6: Intentar encolar cuando la cola está llena
    assert q.enqueue(40) == False 
    
    # Test 4: Desencolar un valor
    assert q.dequeue() == 10

    # Test 5: Verificar estado después de desencolar
    assert q.size == 2
    assert q.head == 1

    # Test 7: Vaciar la cola y verificar
    q.dequeue()
    q.dequeue()
    assert q.empty() == True

    # Test 8: Desencolar de una cola vacía
    assert q.dequeue() == None