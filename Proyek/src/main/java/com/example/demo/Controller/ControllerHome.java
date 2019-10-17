package com.example.demo.Controller;

import com.example.demo.Model.KaryawanEntity;
import com.example.demo.Model.KeluargaEntity;
import com.example.demo.Service.ServiceHome;
import com.example.demo.Service.ServiceKeluarga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class ControllerHome {

    @Autowired
    ServiceHome serviceHome;
    ServiceKeluarga serviceKeluarga;


    @GetMapping("/")
    public String panggil(Map <String , Object> model){
        model.put("karyawan",serviceHome.panggil());
        return "/Index";
    }



    @GetMapping("/Tambah")
    public String Tambah (Map <String , Object> model){
        return "/Tambah";
    }

    @PostMapping("/")
    public String simpan(Map <String , Object> model,
                         @RequestParam("nama")String nama,
                         @RequestParam ("alamat")String alamat){

        KaryawanEntity kry = new KaryawanEntity();

        kry.setNamaKaryawan(nama);
        kry.setAlamatKaryawan(alamat);

        serviceHome.simpan(kry);
        return this.panggil(model);
    }




    @GetMapping("/Ubah")
    public String ubah(Map <String , Object> model,
                        @RequestParam ("id")int id){
        KaryawanEntity kry = serviceHome.cari(id);
        model.put("karyawan",kry);
        return "/Ubah";
    }

    @PostMapping("/Ubah1")
    public String simpan2(Map <String , Object> model,
                          @RequestParam ("id") int id,
                          @RequestParam ("nama")String nama,
                          @RequestParam ("alamat")String alamat){

        KaryawanEntity kry = new KaryawanEntity();

        kry.setId(id);
        kry.setNamaKaryawan(nama);
        kry.setAlamatKaryawan(alamat);

        serviceHome.simpan(kry);
        return this.panggil(model);
    }



    @GetMapping("/Delete")
    public String hapus(Map <String , Object> model,
                         @RequestParam ("id")int id){
        serviceHome.hapus(id);
        return this.panggil(model);
    }



    @GetMapping("/Keluarga")
    public String panggil2(Map <String , Object> model,
                           @RequestParam ("id")int id){
        List<KeluargaEntity> keluargaEntities = serviceKeluarga.panggil2(id);
        model.put("keluarga",keluargaEntities);
        return "/IndexKeluarga";
    }

}