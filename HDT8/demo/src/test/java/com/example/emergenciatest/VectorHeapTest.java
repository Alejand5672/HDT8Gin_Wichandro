package com.example.emergenciatest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.example.emergencia.Paciente;
import com.example.emergencia.VectorHeap;

public class VectorHeapTest {
  @Test
  public void testAddAndRemove() {
      VectorHeap<Paciente> heap = new VectorHeap<>();
      heap.add(new Paciente("A", "Síntoma", 'A'));
      heap.add(new Paciente("B", "Síntoma", 'C'));
      heap.add(new Paciente("C", "Síntoma", 'B'));

      assertEquals('A', heap.remove().getCodigoEmergencia());
      assertEquals('B', heap.remove().getCodigoEmergencia());
      assertEquals('C', heap.remove().getCodigoEmergencia());
  }

  @Test
  public void testIsEmpty() {
      VectorHeap<Paciente> heap = new VectorHeap<>();
      assertTrue(heap.isEmpty());
      heap.add(new Paciente("A", "Síntoma", 'A'));
      assertFalse(heap.isEmpty());
  }
}