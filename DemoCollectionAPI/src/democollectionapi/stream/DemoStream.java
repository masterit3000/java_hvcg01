/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionapi.stream;

import democollectionapi.SinhVien;
import democollectionapi.SinhVienDTO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Admin
 */
public class DemoStream {

    public static void main(String[] args) {

        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien(15, "5âgggg55555"));
        list.add(new SinhVien(1, "aaaaaaa"));
        list.add(new SinhVien(4, "444444fffffffff4444"));
        list.add(new SinhVien(11, "nnnn11111111"));
        list.add(new SinhVien(19, "rrrrrr999999999"));

        Stream<SinhVien> stream = list.stream();
        stream.filter(new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien t) {
                System.out.println("dang loc sv: " + t);
                return t.getMa() % 2 == 1;
            }
        }).forEach((x) -> System.out.println("ketqua: " + x));
        System.out.println("***************************************");

//        stream.sorted(new Comparator<SinhVien>() {
        list.stream().sorted(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        }).forEach((x) -> System.out.println("ketqua: " + x));

//        Supplier<Stream> supplier = () -> {
//            return stream; //To change body of generated lambdas, choose Tools | Templates.
//        };
//        
//        supplier.get()
        System.out.println("***************************************");
        list.stream().sorted(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                System.out.println("so sanh: " + o1 + " voi : " + o2);
                return o1.getTen().compareTo(o2.getTen());
            }
        }).filter(new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien t) {
                System.out.println("dang test: " + t);
                return t.getMa() % 2 == 1;
            }
        }).forEach((x) -> System.out.println("ketqua: " + x));
        System.out.println("#####################################");
        List<SinhVienDTO> collect = list.stream().map(new Function<SinhVien, SinhVienDTO>() {
            @Override
            public SinhVienDTO apply(SinhVien t) {
                SinhVienDTO svdto = new SinhVienDTO();
                svdto.setMa(String.valueOf(t.getMa()));
                svdto.setTen(t.getTen().toUpperCase());
                return svdto;
            }
        }).collect(Collectors.toList());

        List<SinhVienDTO> listDTO = new ArrayList<SinhVienDTO>();
        for (SinhVien sinhVien : list) {
            SinhVienDTO svdto = new SinhVienDTO();
            svdto.setMa(String.valueOf(sinhVien.getMa()));
            svdto.setTen(sinhVien.getTen().toUpperCase());
            listDTO.add(svdto);

        }

    }

}
