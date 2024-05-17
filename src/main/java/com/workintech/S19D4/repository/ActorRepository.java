package com.workintech.S19D4.repository;

import com.workintech.S19D4.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

// jpaRepository i neden service katmanında direk kullanmıyoruz ?
// Çünkü service katmanı, veritabanına doğrudan bağımlı olmamalıdır yazılım müh. pratiğine ters bir durumdur.
// eğer service katmanı içinde kullanırsak kodun taşınabilirliğini azaltır ve değişikliklere karşı daha kırılgan hale getirir.
//Service katmanı, iş mantığını yürütmek ve işlemleri gerçekleştirmek için tasarlanmıştır. Veritabanı işlemleri bu katmanın sorumluluğu değildir.
public interface ActorRepository extends JpaRepository<Actor,Long> {


}
