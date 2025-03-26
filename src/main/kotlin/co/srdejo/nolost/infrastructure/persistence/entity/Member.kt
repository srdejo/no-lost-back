package co.srdejo.nolost.infrastructure.persistence.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "member")
data class Member(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "is_baptized")
    var isBaptized: Boolean = false,

    @Column(name = "joined_date", nullable = false)
    var joinedDate: LocalDate,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    var person: Person,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    var role: ChurchRole,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leader_id")
    var leader: Member? = null,

    @OneToMany(mappedBy = "mentor", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var mentorshipProcess: MutableList<MentorshipProcess> = mutableListOf()

)