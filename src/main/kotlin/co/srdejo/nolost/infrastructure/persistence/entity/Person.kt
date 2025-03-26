package co.srdejo.nolost.infrastructure.persistence.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "person")
data class Person (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "full_name", nullable = false)
    var fullName: String,

    @Column(name = "date_of_birth", nullable = false)
    var dateOfBirth: LocalDate,

    @Column(name = "is_local_residence", nullable = false)
    var isLocalResidence: Boolean,

    @Column(name = "residence_neighborhood")
    var residenceNeighborhood: String,

    @Column(name = "marital_status")
    var maritalStatus: String, // @ToDo change to enum

    @Column(name = "gender", nullable = false)
    var gender: String, // @ToDo change to enum

    @Column(name = "allow_contact")
    var allowContact: Boolean,

)