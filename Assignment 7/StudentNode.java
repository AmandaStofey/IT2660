
import java.util.Arrays;
import java.util.ArrayList;

public class StudentNode {

    private Student student; //root
    private StudentNode leftChild;
    private StudentNode rightChild;

    public String getStudentName() {
        return student.getName();
    }
    
    public int getStudentID() {
        return student.getID();
    }
    
    public double getStudentGPA() {
        return student.getGPA();
    }

    public static void merge(Student[] left_array, Student[] right_array, Student[] array) {
        int i = 0, left = 0, right = 0;

        while (left < left_array.length && right < right_array.length) {

            if (left_array[left].getName().compareTo(right_array[right].getName()) < 0) {
                array[i++] = left_array[left++];
            } else {
                array[i++] = right_array[right++];
            }
        }

        while (left < left_array.length) {
            array[i++] = left_array[left++];
        }
        while (right < right_array.length) {
            array[i++] = right_array[right++];
        }

    }

    public static void MergeSort(Student[] array) {
        if (array.length < 2) {
            return;
        }

        int middle = array.length / 2;
        Student[] left_array = new Student[middle];
        Student[] right_array = new Student[array.length - middle];
        int k = 0;

        for (int i = 0; i < array.length; ++i) {
            if (i < middle) {
                left_array[i] = array[i];
            } else {
                right_array[k] = array[i];
                k = k + 1;
            }
        }

        MergeSort(left_array);
        MergeSort(right_array);
        merge(left_array, right_array, array);
    }

    public static StudentNode fromArray(Student[] values) {
        MergeSort(values);
        return new StudentNode(values);
    }

    public StudentNode(Student[] values) {
        int length = values.length;

        switch (length) {
            case 1: // Base Case 1
                this.student = values[0];
                return;
            case 2: // Base Case 2
                if (values[0].getName().compareTo(values[1].getName()) < 0) {
                    this.student = values[0];
                    this.leftChild = new StudentNode(new Student[]{values[1]});

                } else {
                    this.student = values[1];
                    this.leftChild = new StudentNode(new Student[]{values[0]});
                }
            default: //recursion
                int median = length / 2;
                Student[] leftArray = Arrays.copyOfRange(values, 0, median);
                Student[] rightArray = Arrays.copyOfRange(values, median + 1, values.length);
                if (leftArray.length > 0) {
                    this.leftChild = new StudentNode(leftArray);
                }
                this.student = values[median];
                if (rightArray.length > 0) {
                    this.rightChild = new StudentNode(rightArray);
                }
        }
    }

    public void Insert(Student newStudent) {
        StudentNode tempNode = new StudentNode(new Student[]{newStudent});
        StudentNode current;
        StudentNode parent;

        if (student == null) {
            student = newStudent;
        } else {
            current = this;
            parent = null;

            while (true) {
                parent = current;
                current = null;

                if (newStudent.getName().compareTo(parent.getStudentName()) < 0) {
                    current = parent.leftChild;

                    if (current == null) {
                        parent.leftChild = tempNode;
                        break;
                    }

                } else {
                    current = parent.rightChild;

                    if (current == null) {
                        parent.rightChild = tempNode;
                        break;
                    }
                }
            }

        }
    }

    public StudentNode Fetch(String targetStudent) {
        StudentNode current = this;

        while (current.getStudentName().compareTo(targetStudent) != 0) {;

            if (current.getStudentName().compareTo(targetStudent) > 0) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                System.out.println("This Student does not exist.");
                return null;
            }

        }
        return current;

    }

    public StudentNode viewStudent(String targetStudent) {
        StudentNode current = this;

        System.out.println("Student Information:");
        while (current.getStudentName().compareTo(targetStudent) != 0) {;

            if (current.getStudentName().compareTo(targetStudent) > 0) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                System.out.println("This Student does not exist.");
                return null;
            }

        }
        System.out.println(current.getStudentName());
        System.out.println(current.getStudentID());
        System.out.println(current.getStudentGPA());
        return current;

    }

    public StudentNode minValue(StudentNode root) {
        StudentNode current = root;
        StudentNode parent = null;
        while (current.leftChild != null) {
            parent = current;
            current = current.leftChild;
            
        }
        parent.leftChild = current.rightChild;
        return current;
    }

    public void Delete(String targetName) {
        StudentNode current;
        StudentNode parent;
        current = this;
        parent = null;

        while (current != null) {
            parent = current;
            current = null;
            int result = targetName.compareTo(parent.getStudentName());

            if (result < 0) {
                current = current.leftChild;

            } else if (result > 0) {
                current = current.rightChild;

            } else {
                if (current.leftChild != null && current.rightChild != null) {
                    StudentNode replacement = minValue(current.rightChild);
                    replacement.leftChild = current.leftChild;
                    replacement.rightChild = current.rightChild;
                    if (parent.leftChild.getStudentName() == current.getStudentName()) {
                        parent.leftChild = replacement;

                    } else {
                        parent.rightChild = replacement;
                    }

                } else if (current.leftChild != null) {
                    if (parent.leftChild.getStudentName() == current.getStudentName()) {
                        parent.leftChild = current.leftChild;

                    } else {
                        parent.rightChild = current.leftChild;
                    }
                } else {
                    if (parent.leftChild.getStudentName() == current.getStudentName()) {
                        parent.leftChild = current.rightChild;

                    } else {
                        parent.rightChild = current.rightChild;
                    }

                }
            }

        }
    }

    public void Update(String targetStudent, int idNumber, double gpa) {
        StudentNode node = this.Fetch(targetStudent);
        if (node != null) {
            node.student.setID(idNumber);
            node.student.setGPA(gpa);
        }

    }

    public void Output() {
        if (this.leftChild != null) {
            this.leftChild.Output();
        }
        if (this.student != null) {
            System.out.println(student.getName());
            System.out.println(student.getID());
            System.out.println(student.getGPA());

        }
        if (this.rightChild != null) {
            this.rightChild.Output();
        }

    }

}
