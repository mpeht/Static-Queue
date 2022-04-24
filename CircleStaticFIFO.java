/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifo;

/**
 *
 * @author mpeht
 */
public class CircleStaticFIFO {

    private int vet[];
    private int begin, end, qtdElem, size;

    public CircleStaticFIFO(int size) {
        this.begin = 0;
        this.end = 0;
        this.qtdElem = 0;
        this.size = size;
        this.vet = new int[size];
    }

    public int[] getVet() {
        return vet;
    }

    public void setVet(int[] vet) {
        this.vet = vet;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getQtdElem() {
        return qtdElem;
    }

    public void setQtdElem(int qtdElem) {
        this.qtdElem = qtdElem;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        if (getQtdElem() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (getQtdElem() == getSize()) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int elem) {

        if (!isFull()) {
            this.vet[end] = elem;
            qtdElem++;
            end++;
            if (getEnd() == getSize()) {
                setEnd(0);
            }
        } else if (isFull()) {
            this.vet[0] = elem;
            qtdElem++;
            end++;
            if (getEnd() == getSize()) {
                setEnd(0);
            }
        }
    }

    public void remove() {
        int temp = 0;
        if (!isEmpty()) {
            temp = vet[begin];
            vet[begin] = 0;
            begin++;
            qtdElem--;

            System.out.println("Removed: " + temp);
            if (getBegin() == getSize()) {
                setBegin(-1);
            }
        }
    }

    public void nextElement() {
        int temp = 0;
        if (!isEmpty()) {
            temp = vet[begin];
            System.out.println("The next Element to retire is " + temp);
        }
    }

    public void seeArray() {
        int i, j, k;

             if (getBegin() < getEnd()) {
                for (i = begin; i < end; i++) {
                    System.out.println(vet[i] + " is number " + (i + 1) + " of line");
                }
            } else if (getBegin() > getEnd()) {
                for (j = begin; j < vet.length; j++) {
                    System.out.println(vet[j] + " is number " + (j + 1) + " of line");
                }
                for (k = 0; k <= begin; k++) {
                    System.out.println(vet[k] + " is number " + (k + 1) + " of line");
                }
            }
        }
    }
