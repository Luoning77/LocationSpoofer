package com.vincenthzr.locationspoofer.data.model

import com.vincenthzr.locationspoofer.data.cloud.CloudClientArtifact
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact

data class GithubRelease(
    val versionName: String,
    val body: String,
    val downloadUrl: String?,
    val downloadUrl32Bit: String?,
    val publishedAt: String,
    val isPrerelease: Boolean,
    val artifacts: List<CloudClientArtifact> = emptyList(),
    val versionCode: Int = 0,
    val updateArtifacts: List<UpdateArtifact> = emptyList(),
)
