/*
 * MIT License
 *
 * Copyright (c) 2020 rajandev17
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.rajankali.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rajankali.core.data.Movie
import com.rajankali.core.data.RecentSearch
import com.rajankali.core.data.UserEntity
import com.rajankali.core.database.dao.MovieDao
import com.rajankali.core.database.dao.RecentSearchDao
import com.rajankali.core.database.dao.UserDao

@Database(entities = [UserEntity::class, Movie::class, RecentSearch::class], version = 1, exportSchema = false)
abstract class PlasmaDB : RoomDatabase() {
    abstract val userDao: UserDao
    abstract val movieDao: MovieDao
    abstract val recentSearchDao: RecentSearchDao
}
