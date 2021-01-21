package com.example.demo.Controller;

import com.example.demo.Model.HomeEntity;
import com.example.demo.Service.ServiceHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ControllerHome {

    @Autowired
    ServiceHome serviceHome;

    @GetMapping("/")
    public String panggilAllKaryawan(Map<String, Object> model) {
        model.put("karyawan", serviceHome.panggilAllKaryawan());
        return "/Index";
    }

    @PostMapping("/")
    public String simpanKaryawan(Map<String, Object> model,
                                 @RequestParam("idKaryawan") int idKaryawan,
                                 @RequestParam("namaKaryawan") String namaKaryawan,
                                 @RequestParam("alamatKaryawan") String alamatKaryawan){
        HomeEntity kry = new HomeEntity();
        kry.setIdKaryawan(idKaryawan);
        kry.setNamaKaryawan(namaKaryawan);
        kry.setAlamatKaryawan(alamatKaryawan);
        serviceHome.simpanKaryawan(kry);
        return this.panggilAllKaryawan(model);
    }

    @GetMapping("/TambahKaryawan")
    public String tambahKaryawan(Map<String, Object> model) {
        return "/TambahKaryawan";
    }

    @GetMapping("/UbahKaryawan")
    public String ubahKaryawan(Map<String, Object> model,
                               @RequestParam("idKaryawan") int idKaryawan) {
        HomeEntity kry = serviceHome.cariKaryawan(idKaryawan);
        model.put("karyawan", kry);
        return "/UbahKaryawan";
    }

    @GetMapping("/DeleteKaryawan")
    public String hapusKaryawan(Map<String, Object> model,
                                @RequestParam("idKaryawan") int idKaryawan) {
        serviceHome.hapusKaryawan(idKaryawan);
        return this.panggilAllKaryawan(model);
    }
}