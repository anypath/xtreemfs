/*
 * Copyright (c) 2012-2013 by Jens V. Fischer, Zuse Institute Berlin
 *               
 *
 * Licensed under the BSD License, see LICENSE file for details.
 *
 */

package org.xtreemfs.sandbox.benchmark;

import org.xtreemfs.common.libxtreemfs.Volume;

/**
 * Instantiates a benchmark dependig on the BenchmarkType.
 * 
 * @author jensvfischer
 */
class BenchmarkFactory {

    static AbstractBenchmark createBenchmark(BenchmarkType benchmarkType, Volume volume, Params params)
            throws Exception {

        AbstractBenchmark benchmark = null;

        switch (benchmarkType) {
        case SEQ_WRITE:
            benchmark = new SequentialWriteBenchmark(volume, params);
            break;
        case SEQ_READ:
            benchmark = new SequentialReadBenchmark(volume, params);
            break;
        case RAND_WRITE:
            benchmark = new RandomWriteBenchmark(volume, params);
            break;
        case RAND_READ:
            benchmark = new RandomReadBenchmark(volume, params);
            break;
        case FILES_WRITE:
            benchmark = new FilebasedWriteBenchmark(volume, params);
            break;
        case FILES_READ:
            benchmark = new FilebasedReadBenchmark(volume, params);
            break;
        }
        return benchmark;
    }
}
