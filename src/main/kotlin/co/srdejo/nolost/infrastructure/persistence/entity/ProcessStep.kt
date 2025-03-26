package co.srdejo.nolost.infrastructure.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "process_step")
data class ProcessStep(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var name: String,

    @Column(name = "step_order", nullable = false)
    var order: Int,

    @Column(nullable = false)
    var description: String,

    @Column(nullable = false)
    var isActive: Boolean,

    @OneToMany(mappedBy = "step", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var membershipProcess: MutableList<MembershipProcess> = mutableListOf()

)
