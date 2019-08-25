package dev.rivu.nasaapodarchive.domain.schedulers

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

class FakeSchedulerProvider: SchedulerProvider {
    override fun computation(): Scheduler = Schedulers.trampoline()

    override fun io(): Scheduler = Schedulers.trampoline()

    override fun ui(): Scheduler = Schedulers.trampoline()
}