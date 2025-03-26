package co.srdejo.nolost.infrastructure.persistence.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "membership_process")
data class MembershipProcess(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    var status: String? = null, // @ToDo change to enum

    @Column(name = "completed_at")
    var completedAt: LocalDateTime? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "step_id", nullable = false)
    var step: ProcessStep,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    var person: Person,

    @Column(name = "completed_by") // @ToDo use relationship with user
    var completedBy: Int? = null,

)
