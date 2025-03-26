package co.srdejo.nolost.infrastructure.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "church_role")
data class ChurchRole(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column(nullable = false)
    var name: String,

    @OneToMany(mappedBy = "role", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var members: MutableList<Member> = mutableListOf()
)
