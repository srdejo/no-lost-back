package co.srdejo.nolost.infrastructure.persistence.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "mentorship_process")
data class MentorshipProcess(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var status: String? = null,

    @Column(name = "start_date", nullable = false)
    var startDate: LocalDate,

    @Column(name = "end_date")
    var endDate: LocalDate? = null,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "membership_process_id", nullable = false)
    var membershipProcess: MembershipProcess,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentor_id", nullable = false)
    var mentor: Member,


    )
