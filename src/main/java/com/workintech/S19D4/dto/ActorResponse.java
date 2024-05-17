package com.workintech.S19D4.dto;



import com.workintech.S19D4.entity.Movie;

import java.time.LocalDate;
import java.util.List;

public record ActorResponse(long id, String firstName, String lastName, LocalDate birthDate, List<Movie> movies) {
}

// bu DTO  get isteğinin yanıtını döndüğü için biz burada "record" yapısını kullanıyoruz. "record" yapısı sayesinde bu DTO "immutable yani değişmez oluyor.
// eğer biz "@Data" anatasyonu kullanırsak o zaman bu DTO mutable yani değişkenler değişebilir hale gelir bu da bu dto yu anlamsız hale getirir çünkü burada biz GET isteği
// ile değişmeyen değerleri alıyoruz.