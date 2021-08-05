import java.time.Year;

public class Exercise_04082021 {
    public static void main(String[] args) {

//        //Bài 4
//        Nhập năm sinh của một người.
//        Tính tuổi người đó.

        System.out.println("-----Bài 4-----");
        int CurrentYear = Year.now().getValue();
        int BirthYear = 1994;
        int age = CurrentYear - BirthYear;
        System.out.println("Năm sinh: "+ BirthYear);
        System.out.println("Năm hiện tại: "+ CurrentYear);
        System.out.println("Tuổi hiện tại: "+ age);

        //Bài 5
//        Nhập 2 số a và b.
//        Tính tổng, hiệu, tính và thương của hai số đó.
        System.out.println("-----Bài 5-----");
        int A = 1;
        int B = 2;
        int Tong = A + B;
        int Hieu = A - B;
        double Tich = A * B;
        float Thuong = (float) A / B;
        System.out.println("Số A: "+ A);
        System.out.println("Số B: "+ B);
        System.out.println("Tổng của 2 số: " + Tong);
        System.out.println("Hiệu của 2 số: " + Hieu);
        System.out.println("Tích của 2 số: " + Tich);
        System.out.println("Thương của 2 số: " + Thuong);

        //Bài 6
//        Nhập tên sản phẩm, số lượng và đơn giá.
//        Tính tiền và thuế giá trị gia tăng phải trả, biết:
//        a. tiền = số lượng * đơn giá
//        b. thuế giá trị gia tăng = 10% tiền
        System.out.println("-----Bài 6-----");
        String ProductName = "Bim Bim";
        int Quantity = 8;
        int UnitPrice = 4500;
        int Price = Quantity * UnitPrice;
        double VAT = (float) Price * 10/100;
        System.out.println("Sản Phẩm: "+ ProductName);
        System.out.println("Số Lượng: "+ Quantity);
        System.out.println("Giá SP: "+ UnitPrice);
        System.out.println("Tổng giá tiền của SP: " + Price +"đ");
        System.out.println("Thuế giá trị gia tăng của SP: " + VAT +"đ");

        //Bai 7
//        Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa
//        của một học sinh. Tính điểm trung bình của
//        học sinh đó.
        System.out.println("-----Bài 7-----");
        float diemToan = 9.5f;
        float diemLy = 7.5f;
        float diemHoa = 6.0f;
        float diemTB = (diemHoa + diemLy + diemHoa)/3;
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
        System.out.println("Điểm Trung Bình: " + diemTB);

        //Bai 8
//        Nhập bán kính của đường tròn. Tính chu vi và
//        diện tích của hình tròn đó.
        System.out.println("-----Bài 8-----");
        int r = 10;
        final float PI = 3.14f;
        float p = r * 2 * PI;
        float t = r * r * PI;
        System.out.println("PI: " + PI);
        System.out.println("Bán kính hình tròn: " + r +" cm");
        System.out.println("Chu vi hình tròn: " + p +" cm");
        System.out.println("Diện tích hình tròn: " + t +" cm2");


        //Bài 9
//        Nhập vào số xe của bạn (gồm tối đa 5 chữ số).
//        Cho biết số xe của bạn được mấy nút?
        System.out.println("-----Bài 9-----");
        int soXe1 = 7;
        int soXe2 = 9;
        int soXe3 = 6;
        int soXe4 = 3;
        int soXe5 = 0;
        int soNut = (soXe1 + soXe2 + soXe3 + soXe4 + soXe5) % 10;
        System.out.println("Biển số xe: " + soXe1 + soXe2 + soXe3 + soXe4 + soXe5 );
        System.out.println("Số nút của biển số xe là: " + soNut);

        //Bài 10
//        Nhập vào 2 số nguyên.
//        Tính min và max của hai số đó.
        System.out.println("-----Bài 10-----");
        int soA = 4;
        int soB = 6;
        int max = Math.min(soA,soB);
        int min = Math.max(soA,soB);
        System.out.println("Số A: " + soA);
        System.out.println("Số B: " + soB);
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);

    }
}