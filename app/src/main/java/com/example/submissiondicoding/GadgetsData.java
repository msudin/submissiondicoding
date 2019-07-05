package com.example.submissiondicoding;

import android.os.Parcel;

import java.util.ArrayList;

public class GadgetsData {
    public static String[][] data = new String[][]{
            {"Samsung Galaxy J2","Irul", "Selasa, 02/07/2018", "Samsung Galaxy J2 merupakan keluaran seri terbaru dari juniornya Samsung Galaxy J1", "https://p.ipricegroup.com/uploaded_5f86785222a331e69de020ad5b54711e.jpg", "Rp. 1.500.000"},
            {"Samsung Galaxy J1","Wawan", "Selasa, 02/07/2018", "Samsung Galaxy J1 merupakan keluaran seri terbaru dari  Samsung dengan mengusung tema Android Pintar yang diproduksi tahun 2015", "https://p.ipricegroup.com/uploaded_e1f9fa3d6fe919996d44476ebdd34b29.jpg", "Rp. 1.300.000"},
            {"Xiomi Redmi 5A", "Sulaiman", "Rabu, 03/07/2019", "Xiaomi menutup tahun 2017 dengan cukup fenomenal saat meluncurkan produk terbaru mereka yaitu Redmi 5A. Bagaimana tidak, smartphone ini dibanderol dengan harga yang sangat terjangkau. Redmi 5A disebut-sebut sebagai entry level killer dengan menawarkan spesifikasi tertinggi dibandingkan produk sekelas.","https://gadget.jagatreview.com/wp-content/uploads/2017/12/Redmi-5A-8-400x288.jpg","Rp. 1.300.000"},
            {"Xiomi Redmi Note 7","Subidin", "Rabu, 03/07/2019", " Redmi Note 7 menjadi tajuk pembicaraan hangat di tengah para penggemar gadget di tanah air, bahkan sebelum ponsel ini resmi tiba di Indonesia. Salah satu yang membuatnya begitu dinantikan adalah, kemampuannya menangkap gambar dengan berbekal kamera 48MP.Redmi Note 7 juga menjadi ponsel perdana Redmi setelah resmi menjadi brand yang berdiri sendiri, namun tetap berada di bawah naungan Xiaomi.", "https://www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge_wm_brw/public/article_images/2019/04/redmi-note-7-pro-review-6.jpg?itok=yIdwdVgW", "Rp. 3.000.000"},
            {"Xiomi Redmi Note 5","Subidin", "Rabu, 03/07/2019", "Yang sudah-sudah, Xiaomi seri Redmi selalu mengandalkan chipset powerful dengan harga yang ‘ramah’. Saya merasa lega ketika Xiaomi merilis Redmi Note 5. Sebab, tak hanya tiba dengan chipset Snapdragon 636 yang kencang. Tapi, juga membawa kemampuan kamera yang sekelas atau mendekati smartphone flagship. Yang sudah-sudah, Xiaomi seri Redmi selalu mengandalkan chipset powerful dengan harga yang ‘ramah’. Saya merasa lega ketika Xiaomi merilis Redmi Note 5. Sebab, tak hanya tiba dengan chipset Snapdragon 636 yang kencang. Tapi, juga membawa kemampuan kamera yang sekelas atau mendekati smartphone flagship.", "https://cms.dailysocial.id/wp-content/uploads/2018/07/5362c2ed02676c6e24ad19d34045913e_review-xiaomi-redmi-note-5.jpg", "Rp. 2.800.000"},
            {"Oppo A37S","Selamet", "Rabu, 03/07/2019", "Hai sahabat semua, pada kesempatan kali ini saya akan berbagi informasi seputar spesifikasi Oppo A37f atau A37 atau Neo 9 untuk sobat semua, khususnya para pecinta smartphone Oppo. Ponsel ini terbilang ponsel Oppo versi lawas ya, soalnya hp ini dirilis pada bulan Juni 2016 kemarin, namun karena banyak yang mencari maka saya putuskan untuk membuat review mengenai smartphone ini.", "https://i2.wp.com/www.lambetekno.com/wp-content/uploads/2017/12/Harga-Oppo-A37-dan-A37F.jpg?w=500", "Rp. 1700.000"},
            {"Samsung Galaxy M20","Wawan", "Rabu, 03/07/2018", "Tumben banget Samsung merilis smartphone bagus dengan harga terjangkau dan lagi pakai notch. Biasanya smartphone Samsung kan mahal dibanding dengan kompetitor dikelasnya, teguh pada pendirian, dan nggak mudah ikut-ikutan tren.\n" +
                    "\n" +
                    "Lupakan gengsi, saya pikir Samsung tentu paham betul bagaimana situasinya. Meski masih menjadi vendor smartphone nomor satu di dunia, ancaman dari vendor smartphone asal Tiongkok seperti Huawei, Xiaomi, OPPO, dan Vivo begitu nyata. Samsung bisa saja lengser dari posisi pertama di dunia smartphone.", "https://cms.dailysocial.id/wp-content/uploads/2019/03/5c2b52f0cb3fd1de6ead7cd852157605_Review-Samsung-Galaxy-M20-1.jpg", "Rp. 2.800.000"},
            {"Xiomi Redmi 6A", "Ahmad", "Rabu, 03/07/2019", "Bulan lalu, Xiaomi memboyong dua smartphone baru dari lini Redmi-nya, yaitu Redmi 6 dan 6A. detikINET menguji Redmi 6A yang masuk dalam segmen entry level. Ingin tahu seperti apa performa ponsel ini? Simak ulasannya. ","https://akcdn.detik.net.id/community/media/visual/2018/09/15/b37393ef-db87-4cbd-9762-1bb7d8346ffa.jpeg?a=1","Rp. 1.800.000"},
            {"Oppo A5S","Subidin", "Rabu, 03/07/2019", "Nggak semua orang butuh smartphone flagship atau premium dengan spesifikasi mewah, OPPO sangat memahami segmentasi pasar tersebut. Sebab itu, OPPO punya A series; versi hemat dari F series yang menyasar segmen mid-low dan digarap dengan cukup baik.\n" +
                    "\n" +
                    "Setelah meluncurkan OPPO A3s pada akhir tahun lalu, kini OPPO telah merilis A5s. Sebagai anggota seri A, perangkat ini tetap mewarisi kapasitas baterai besar dan sejumlah elemen kekinian. Sebut saja, desain notch waterdrop screen dan konfigurasi dual camera.", "https://cms.dailysocial.id/wp-content/uploads/2019/04/bcf352985bf9312d79ee5598a8f78bed_Review-OPPO-A5s-16.jpg", "Rp. 2.000.000"},
            {"Oppo A3S","Subidin", "Rabu, 03/07/2019", "Bulan Juli lalu, Oppo meluncurkan smartphone entri level terbarunya yakni A3s. Meskipun kelas menengah, gawai ini menghadirkan spesifikasi dan fitur seperti smartphone premium Oppo. Salah satunya fitur dan spesifikasi handal yang ada di Oppo F9.\n" +
                    "\n" +
                    "Oppo A3s mengusung baterai besar berdaya irit sebagai fitur andalan. Desain notch yang digunakan oleh ponsel premium Oppo masih diadopsi di Oppo A3s. Mulai dari baterai besar, layar luas, teknologi AI di kamera dan sektor lainnya, game space, desain glossy, UI ColorOS 5.1, MusicParty, Kids Space, Applock dan banyak lagi.", "https://selular.id/wp-content/uploads/2018/09/OPPO-A3S1-696x462.jpg", "Rp. 2.400.000"},
    };

    public  static ArrayList<Gadget> getListData(){
        ArrayList<Gadget> list = new ArrayList<>();
        for (String[] aData : data){
            Gadget gadget = new Gadget();
            gadget.setProname(aData[0]);
            gadget.setProby(aData[1]);
            gadget.setProdate(aData[2]);
            gadget.setProdes(aData[3]);
            gadget.setProphoto(aData[4]);
            gadget.setProharga(aData[5]);
            list.add(gadget);
        }
        return  list;
    }
}
