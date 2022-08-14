package com.module.daggertrails.dagger

import com.module.daggertrails.models.third_party.BackSeats
import com.module.daggertrails.models.third_party.CarSeats
import com.module.daggertrails.models.third_party.FrontSeats
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class SeatModule() {

   /* var fsType: String = ""
    var bsType: String = ""

    @Inject
    constructor(fsType: String, bsType: String) : this() {
        this.fsType = fsType
        this.bsType = bsType
    }

    @Provides
    fun provideFrontSeat() = FrontSeat().apply {
        setType(fsType)
    }

    @Provides
    fun providesBackSeat() = BackSeat().apply {
        setType(bsType)
    }

    @Provides
    fun providesSeat(fSeat: FrontSeat, bSeat: BackSeat) = CarSeats(fSeat, bSeat)*/

    private var fSeatMake: FrontSeats = FrontSeats("")
    private var bSeatMake: BackSeats = BackSeats("")

    @Inject
    constructor(fsName: FrontSeats, bsName: BackSeats) : this() {
        fSeatMake = fsName
        bSeatMake = bsName
    }

    @Provides
    fun providesFrontSeat(): FrontSeats {
        return fSeatMake
    }

    @Provides
    fun provideBackSeat(): BackSeats {
        return bSeatMake
    }

    @Provides
    fun providesSeats(fSeat: FrontSeats, bSeats: BackSeats) = CarSeats(fSeat, bSeats)
}
