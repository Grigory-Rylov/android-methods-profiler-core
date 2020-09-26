package com.github.grishberg.android.profiler.plugins

import com.github.grishberg.android.profiler.core.AnalyzerResult

/**
 * Call trace analyzer interface.
 * Plugin analyzer must be implemented this interface.
 */
interface CallTraceAnalyzer {
    /**
     * Analyzer name to be shown in menu.
     */
    fun analyzerName(): String

    /**
     * Main analyzer method.
     */
    fun analyzeCallTrace(input: AnalyzerResult): CallTraceAnalyzerResult
}