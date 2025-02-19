// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.ThreatIntelligenceMetricsListInner;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetric;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetricEntity;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetrics;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ThreatIntelligenceMetricsListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreatIntelligenceMetricsListInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"lastUpdatedTimeUtc\":\"mouwqlgzrfzeey\",\"threatTypeMetrics\":[{\"metricName\":\"ikayuhqlbjbsybb\",\"metricValue\":140703725},{\"metricName\":\"t\",\"metricValue\":1918019278},{\"metricName\":\"fp\",\"metricValue\":1408041355}],\"patternTypeMetrics\":[{\"metricName\":\"as\",\"metricValue\":753407395},{\"metricName\":\"qfxssmwutw\",\"metricValue\":1224801299},{\"metricName\":\"ezpdrhneu\",\"metricValue\":979577305},{\"metricName\":\"kdw\",\"metricValue\":227245186}],\"sourceMetrics\":[{\"metricName\":\"ircgpikpz\",\"metricValue\":2049479560}]}},{\"properties\":{\"lastUpdatedTimeUtc\":\"anlfzxiavrmbz\",\"threatTypeMetrics\":[{\"metricName\":\"i\",\"metricValue\":485732763},{\"metricName\":\"cirgzp\",\"metricValue\":1656770527},{\"metricName\":\"zszrnwoiindfpw\",\"metricValue\":2003190846}],\"patternTypeMetrics\":[{\"metricName\":\"tlhflsjcdhszf\",\"metricValue\":1868624750},{\"metricName\":\"gofel\",\"metricValue\":940217853},{\"metricName\":\"qmqhldvriii\",\"metricValue\":1756672367}],\"sourceMetrics\":[{\"metricName\":\"hfkvtvsexsowuel\",\"metricValue\":1968234640}]}},{\"properties\":{\"lastUpdatedTimeUtc\":\"hhxvrhmzkwpj\",\"threatTypeMetrics\":[{\"metricName\":\"pughftqsxh\",\"metricValue\":59449335},{\"metricName\":\"xukndxdigr\",\"metricValue\":1599924393},{\"metricName\":\"fzdm\",\"metricValue\":1621102365},{\"metricName\":\"fi\",\"metricValue\":1852140441}],\"patternTypeMetrics\":[{\"metricName\":\"z\",\"metricValue\":867678631}],\"sourceMetrics\":[{\"metricName\":\"pph\",\"metricValue\":1764475997}]}}]}")
            .toObject(ThreatIntelligenceMetricsListInner.class);
        Assertions.assertEquals("mouwqlgzrfzeey", model.value().get(0).properties().lastUpdatedTimeUtc());
        Assertions.assertEquals("ikayuhqlbjbsybb",
            model.value().get(0).properties().threatTypeMetrics().get(0).metricName());
        Assertions.assertEquals(140703725, model.value().get(0).properties().threatTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("as", model.value().get(0).properties().patternTypeMetrics().get(0).metricName());
        Assertions.assertEquals(753407395, model.value().get(0).properties().patternTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("ircgpikpz", model.value().get(0).properties().sourceMetrics().get(0).metricName());
        Assertions.assertEquals(2049479560, model.value().get(0).properties().sourceMetrics().get(0).metricValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreatIntelligenceMetricsListInner model
            = new ThreatIntelligenceMetricsListInner().withValue(Arrays.asList(
                new ThreatIntelligenceMetrics().withProperties(new ThreatIntelligenceMetric()
                    .withLastUpdatedTimeUtc("mouwqlgzrfzeey")
                    .withThreatTypeMetrics(Arrays.asList(
                        new ThreatIntelligenceMetricEntity().withMetricName("ikayuhqlbjbsybb")
                            .withMetricValue(140703725),
                        new ThreatIntelligenceMetricEntity().withMetricName("t").withMetricValue(1918019278),
                        new ThreatIntelligenceMetricEntity().withMetricName("fp").withMetricValue(1408041355)))
                    .withPatternTypeMetrics(Arrays.asList(
                        new ThreatIntelligenceMetricEntity().withMetricName("as").withMetricValue(753407395),
                        new ThreatIntelligenceMetricEntity().withMetricName("qfxssmwutw").withMetricValue(1224801299),
                        new ThreatIntelligenceMetricEntity().withMetricName("ezpdrhneu").withMetricValue(979577305),
                        new ThreatIntelligenceMetricEntity().withMetricName("kdw").withMetricValue(227245186)))
                    .withSourceMetrics(Arrays.asList(
                        new ThreatIntelligenceMetricEntity().withMetricName("ircgpikpz").withMetricValue(2049479560)))),
                new ThreatIntelligenceMetrics()
                    .withProperties(new ThreatIntelligenceMetric().withLastUpdatedTimeUtc("anlfzxiavrmbz")
                        .withThreatTypeMetrics(Arrays.asList(
                            new ThreatIntelligenceMetricEntity().withMetricName("i").withMetricValue(485732763),
                            new ThreatIntelligenceMetricEntity().withMetricName("cirgzp").withMetricValue(1656770527),
                            new ThreatIntelligenceMetricEntity().withMetricName("zszrnwoiindfpw")
                                .withMetricValue(2003190846)))
                        .withPatternTypeMetrics(Arrays.asList(
                            new ThreatIntelligenceMetricEntity().withMetricName("tlhflsjcdhszf")
                                .withMetricValue(1868624750),
                            new ThreatIntelligenceMetricEntity().withMetricName("gofel").withMetricValue(940217853),
                            new ThreatIntelligenceMetricEntity().withMetricName("qmqhldvriii")
                                .withMetricValue(1756672367)))
                        .withSourceMetrics(
                            Arrays.asList(new ThreatIntelligenceMetricEntity().withMetricName("hfkvtvsexsowuel")
                                .withMetricValue(1968234640)))),
                new ThreatIntelligenceMetrics().withProperties(new ThreatIntelligenceMetric()
                    .withLastUpdatedTimeUtc("hhxvrhmzkwpj")
                    .withThreatTypeMetrics(Arrays.asList(
                        new ThreatIntelligenceMetricEntity().withMetricName("pughftqsxh").withMetricValue(59449335),
                        new ThreatIntelligenceMetricEntity().withMetricName("xukndxdigr").withMetricValue(1599924393),
                        new ThreatIntelligenceMetricEntity().withMetricName("fzdm").withMetricValue(1621102365),
                        new ThreatIntelligenceMetricEntity().withMetricName("fi").withMetricValue(1852140441)))
                    .withPatternTypeMetrics(Arrays
                        .asList(new ThreatIntelligenceMetricEntity().withMetricName("z").withMetricValue(867678631)))
                    .withSourceMetrics(Arrays.asList(
                        new ThreatIntelligenceMetricEntity().withMetricName("pph").withMetricValue(1764475997))))));
        model = BinaryData.fromObject(model).toObject(ThreatIntelligenceMetricsListInner.class);
        Assertions.assertEquals("mouwqlgzrfzeey", model.value().get(0).properties().lastUpdatedTimeUtc());
        Assertions.assertEquals("ikayuhqlbjbsybb",
            model.value().get(0).properties().threatTypeMetrics().get(0).metricName());
        Assertions.assertEquals(140703725, model.value().get(0).properties().threatTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("as", model.value().get(0).properties().patternTypeMetrics().get(0).metricName());
        Assertions.assertEquals(753407395, model.value().get(0).properties().patternTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("ircgpikpz", model.value().get(0).properties().sourceMetrics().get(0).metricName());
        Assertions.assertEquals(2049479560, model.value().get(0).properties().sourceMetrics().get(0).metricValue());
    }
}
