package godot.core

import godot.RandomNumberGenerator

internal interface gdRandom {
    val rng: RandomNumberGenerator

    /** Random range, any floating point value between from and to. */
    fun rand_range(from: Float, to: Float) = rand_range(from.toDouble(), to.toDouble()).toFloat()

    /** Random range, any floating point value between from and to. */
    fun rand_range(from: Double, to: Double) = rng.randfRange(from, to).toDouble()

    /** Random from seed: pass a seed, and an array with both number and new seed is returned. "Seed" here refers to the internal state of the pseudo random number generator.
     * The internal state of the current implementation is 64 bits. */
    fun rand_seed(seed: Long): Pair<Long, Long> {
        rng.seed = seed
        //Call to randi() should change the value of the seed, that's why we retrieve again in the return statement
        val randomValue = rng.randi()
        return Pair(rng.seed, randomValue)
    }

    /** Returns a random floating point value on the interval [0, 1]. */
    fun randf() = rng.randf()

    /** Returns a random signed 32 bit integer. */
    fun randi() = rng.randi().toInt()

    /** Randomizes the seed (or the internal state) of the random number generator. Current implementation reseeds using a number based on time. */
    fun randomize() = rng.randomize()

    fun seet(seed: Long) = rng.setSeed(seed)
}
