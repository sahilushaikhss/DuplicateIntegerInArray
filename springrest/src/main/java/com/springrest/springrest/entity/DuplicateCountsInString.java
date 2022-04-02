package com.springrest.springrest.entity;

public class DuplicateCountsInString {

    public static void main(String[] args) {

  /*   List<Integer> list= new ArrayList<>();
     list.addAll(Arrays.asList(10,20,30,40));
        List<Integer> list1= new ArrayList<>();
        list.addAll(Arrays.asList(15,25,35,45));

        List<Integer> list3= new ArrayList<>();
        list3.addAll(list);
        list3.addAll(list1);
        System.out.println(list3);*/
      /*  System.out.println(list);
        List<Integer> integers = list.stream().map(i -> i * 10).collect(Collectors.toList());
        System.out.println(integers);*/
        int[]a={10,20,30};
        int[]b={15,25,35,40,45};

        int a_len=a.length;
        int b_len=b.length;
        int c_len=a_len+b_len;
        int[] c= new int[c_len];

        for(int i=0; i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0; i<b.length;i++){
            c[a_len+i]=b[i];
        }
        for (int i=0; i<c.length;i++){
            System.out.print(c[i]+" ");
        }

    }
}
